/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author fusm-cat-palmira
 */
@Entity 
public class Sala implements Serializable{
 
    @Id
    private Integer num_sala;
    
    @Column (length = 50,nullable = false,unique = false)  
    private String nombre;

    @Column (length = 50,nullable = false,unique = false)  
    private Integer capacidad;

    @Column (nullable = false,unique = false)  
    private Boolean proyector;


    public Sala() {
    }

    public Sala(Integer num_sala, String nombre, Integer capacidad, Boolean proyector) {
        this.num_sala = num_sala;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.proyector = proyector;
    }

    
    public Integer getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(Integer num_sala) {
        this.num_sala = num_sala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getProyector() {
        return proyector;
    }

    public void setProyector(Boolean proyector) {
        this.proyector = proyector;
    }
    

    
}
