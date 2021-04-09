package com.ejemplo.ejemplo_trazas.model;

import org.springframework.stereotype.Component;

@Component("unaPersona")
public class Persona {

    private String nombre;

    public Persona() {
    }


    /**
     * 
     * @param nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Persona [" +
            " nombre=" + getNombre() + 
            "]";
    }

    
}
