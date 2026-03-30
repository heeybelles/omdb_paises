package com.example.omdb_titulos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pais {

    @JsonProperty("name")
    private Name name;

    @JsonProperty("capital")
    private java.util.List<String> capital;

    @JsonProperty("region")
    private String region;

    @JsonProperty("subregion")
    private String subregion;

    @JsonProperty("population")
    private long population;

    @JsonProperty("area")
    private String area;

    @JsonProperty("flags")
    private Flags flags;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class Name {
        @JsonProperty("common")
        private String common;

        @JsonProperty("official")
        private String official;

            public String getCommon() {
                return common;
            }

            public void setCommon(String common) {
                this.common = common;
            }

            public String getOfficial() {
                return official;
            }

            public void setOfficial(String official) {
                this.official = official;
            }
    }

    @com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
    public static class Flags {

        @JsonProperty("png")
        private String png;

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }
    }

}
