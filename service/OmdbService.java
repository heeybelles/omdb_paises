package com.example.omdb_titulos.service;

import com.example.omdb_titulos.model.Pais;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OmdbService {

    @Value("${paises.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public OmdbService(){
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    public Pais searchForName(String name) {
        String url = apiUrl + name;
        System.out.println("Searching in the URL: " + url);
        try {
            String json = restTemplate.getForObject(url, String.class);
            Pais[] paises = objectMapper.readValue(json, Pais[].class);
            if(paises != null && paises.length > 0){
                return paises[0];
            }
        } catch (Exception e) {
            System.err.println("Error for searching a country: " + e.getMessage());

        }
        return null;
    }
}
