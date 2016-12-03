/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fusm-cat-palmira
 */
@Entity
public class Periodo implements Serializable { 
    
    
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(nullable = false, unique = true) 
    private Integer anion;
    
    @Column(nullable = false, unique = true) 
    private Integer periodo_num;

    
    
    public Periodo() {
    }

    public Periodo(Integer codigo, Integer anion, Integer periodo_num) {
        this.codigo = codigo;
        this.anion = anion;
        this.periodo_num = periodo_num;
    }

    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAnion() {
        return anion;
    }

    public void setAnion(Integer anion) {
        this.anion = anion;
    }

    public Integer getPeriodo_num() {
        return periodo_num;
    }

    public void setPeriodo_num(Integer periodo_num) {
        this.periodo_num = periodo_num;
    }
    
    
}
