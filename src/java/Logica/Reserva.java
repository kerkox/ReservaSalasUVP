/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fusm-cat-palmira
 */
@Entity
public class Reserva implements Serializable {

    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo; 
    
    private Date fecha_creacion;
    
    private Date fecha_inicio;
    
    
    private Float duracion; 
    
    
    private String 
}
