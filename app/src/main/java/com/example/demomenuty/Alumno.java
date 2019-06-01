package com.example.demomenuty;

public class Alumno {
    private String nombre;
    private String apellido;
    private String sede;

    public Alumno(String nombre, String apellido, String sede) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }


    @Override
    public String toString(){
        return getNombre() + " " + getApellido() + " (" + getSede() + ")";
    }

}
