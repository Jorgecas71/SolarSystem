package dev.jorge.SolarSystem;

public class Planet {
    private String name = null;
    private int satellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int distanceToSun = 0;
    private PlanetType type;
   
    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    boolean esObservable = false;

    public Planet(String name, int satellites, double mass, double volume, int diameter, int distanceToSun,
            PlanetType type) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceToSun = distanceToSun;
        this.type = type;
    }

    



}