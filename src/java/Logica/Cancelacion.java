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
public class Cancelacion implements Serializable {
    
    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo; 
    
        
    @Column (length = 100,nullable = false,unique = false)   
    private String motivo;

    public Cancelacion() {
    }


    public Cancelacion(Integer codigo, String motivo) {
        this.codigo = codigo;
        this.motivo = motivo;
    }
    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    

    
    
    
    
    
    
    
}
