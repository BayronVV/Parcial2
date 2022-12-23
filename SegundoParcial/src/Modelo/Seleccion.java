/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Seleccion {
    
    private Integer id;
    private String nombre;
    private Integer continente_id;
    private String tecnico;
    private Integer goles_favor;
    private Integer goles_contra;
    private Integer partidos_ganados;
    private Integer partidos_perdidos;
    private Integer partidos_jugados;

    
   public static ArrayList<Seleccion> selecciones = new ArrayList<>();
   
    public Seleccion() {
    }

    public Seleccion(Integer id) {
        this.id = id;
    }

    public Seleccion(Integer id, String nombre, Integer continente_id, String tecnico, Integer goles_favor, Integer goles_contra, Integer partidos_ganados, Integer partidos_perdidos, Integer partidos_jugados) {
        this.id = id;
        this.nombre = nombre;
        this.continente_id = continente_id;
        this.tecnico = tecnico;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.partidos_ganados = partidos_ganados;
        this.partidos_perdidos = partidos_perdidos;
        this.partidos_jugados = partidos_jugados;
    }

    public Seleccion(String nombre, Integer continente_id, String tecnico, Integer goles_favor, Integer goles_contra, Integer partidos_ganados, Integer partidos_perdidos, Integer partidos_jugados) {
        this.nombre = nombre;
        this.continente_id = continente_id;
        this.tecnico = tecnico;
        this.goles_favor = goles_favor;
        this.goles_contra = goles_contra;
        this.partidos_ganados = partidos_ganados;
        this.partidos_perdidos = partidos_perdidos;
        this.partidos_jugados = partidos_jugados;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getContinente_id() {
        return continente_id;
    }

    public void setContinente_id(Integer continente_id) {
        this.continente_id = continente_id;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Integer getGoles_favor() {
        return goles_favor;
    }

    public void setGoles_favor(Integer goles_favor) {
        this.goles_favor = goles_favor;
    }

    public Integer getGoles_contra() {
        return goles_contra;
    }

    public void setGoles_contra(Integer goles_contra) {
        this.goles_contra = goles_contra;
    }

    public Integer getPartidos_ganados() {
        return partidos_ganados;
    }

    public void setPartidos_ganados(Integer partidos_ganados) {
        this.partidos_ganados = partidos_ganados;
    }

    public Integer getPartidos_perdidos() {
        return partidos_perdidos;
    }

    public void setPartidos_perdidos(Integer partidos_perdidos) {
        this.partidos_perdidos = partidos_perdidos;
    }

    public Integer getPartidos_jugados() {
        return partidos_jugados;
    }

    public void setPartidos_jugados(Integer partidos_jugados) {
        this.partidos_jugados = partidos_jugados;
    }
    String h;
    public String mostrar(){
     
      return  h = "Nombre :"+nombre+", Tecnico(a): "+tecnico+", Goles a favor: "+goles_favor+", goles en contra: "+goles_contra+"\n";
    
    }
   
    
}
