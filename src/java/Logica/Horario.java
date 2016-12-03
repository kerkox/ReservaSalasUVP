/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author fusm-cat-palmira
 */

@Entity
public class Horario implements Serializable{
 
    
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;  
 
    @Column (length = 50,nullable = false,unique = false) 
    private String dia_semana;
            
    @Column (length = 50,nullable = false,unique = false) 
    private String fecha_hora_inicio;
    
    @Column (length = 50,nullable = false,unique = false) 
    private String fecha_hora_fin; 

    
    public Horario() {
    }

    public Horario(Integer codigo, String dia_semana, String fecha_hora_inicio, String fecha_hora_fin) {
        this.codigo = codigo;
        this.dia_semana = dia_semana;
        this.fecha_hora_inicio = fecha_hora_inicio;
        this.fecha_hora_fin = fecha_hora_fin;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getFecha_hora_inicio() {
        return fecha_hora_inicio;
    }

    public void setFecha_hora_inicio(String fecha_hora_inicio) {
        this.fecha_hora_inicio = fecha_hora_inicio;
    }

    public String getFecha_hora_fin() {
        return fecha_hora_fin;
    }

    public void setFecha_hora_fin(String fecha_hora_fin) {
        this.fecha_hora_fin = fecha_hora_fin;
    }
    
    
     
    
    
}
