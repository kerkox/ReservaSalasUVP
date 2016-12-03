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
public class Curso implements Serializable{
    
    @Id
    private String codigo;
    
    @Column (length = 50,nullable = false,unique = false) 
    private String nom_asignatura;
    
    @Column(nullable = true, unique = false)
    private Integer cant_matriculados;

    
    
    
    public Curso() {   
    }

    public Curso(String codigo, String nom_asignatura, Integer cant_matriculados) {
        this.codigo = codigo;
        this.nom_asignatura = nom_asignatura;
        this.cant_matriculados = cant_matriculados;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNom_asignatura() {
        return nom_asignatura;
    }

    public void setNom_asignatura(String nom_asignatura) {
        this.nom_asignatura = nom_asignatura;
    }

    public Integer getCant_matriculados() {
        return cant_matriculados;
    }

    public void setCant_matriculados(Integer cant_matriculados) {
        this.cant_matriculados = cant_matriculados;
    }


    
    
    

    
    
    
}
