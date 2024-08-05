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
    
    void imprimir() {
System.out.println("Nombre del planeta = "+ name);
System.out.println("Cantidad de satélites = " + satellites);
System.out.println("Masa del planeta = " + mass);
System.out.println("Volumen del planeta = " + volume);
System.out.println("Diámetro del planeta = " + diameter);
System.out.println("Distancia al sol = " + distanceToSun);
System.out.println("Tipo de planeta = " + type);
System.out.println("Es observable = " + esObservable);
}

    
double calcularDensidad() {
    return mass / volume;
}

boolean esPlanetaExterior() {
    float límite = (float) (149597870 * 3.4);

    if (distanceToSun > límite) {
        return true;
    } else {
        return false;
    }
}
}