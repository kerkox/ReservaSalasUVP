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
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;

/**
 *
 * @author fusm-cat-palmira
 */
@Entity
public class Reserva implements Serializable {

    @Id     
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo; 
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_creacion;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    
    @Column(nullable = true, unique = true) 
    private Float duracion;     
    
    @Column (length = 50,nullable = true,unique = false)  
    private String soft_especifico;
    
    @Column (length = 50,nullable = true,unique = false)
    private String observaciones;
    
    @JoinColumn (nullable = false,unique = false)
    private Monitor monitor;
    
    @JoinColumn (nullable = true,unique = false)
    private Sala sala;
    
    @JoinColumn (nullable = true,unique = false)
    private Sancion sancion;
    
    @JoinColumn (nullable = true,unique = false)
    private Cancelacion cancelacion;

    public Reserva() {
    }

    public Reserva(Integer codigo, Date fecha_inicio, Float duracion, String soft_especifico, String observaciones) {
        this.codigo = codigo;
        this.fecha_creacion = new Date();
        this.fecha_inicio = fecha_inicio;
        this.duracion = duracion;
        this.soft_especifico = soft_especifico;
        this.observaciones = observaciones;
        this.monitor = new Monitor();
        this.sala = new Sala();
        this.sancion = new Sancion();
        this.cancelacion = new Cancelacion();
    }
    
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public String getSoft_especifico() {
        return soft_especifico;
    }

    public void setSoft_especifico(String soft_especifico) {
        this.soft_especifico = soft_especifico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public void setSancion(Sancion sancion) {
        this.sancion = sancion;
    }

    public Cancelacion getCancelacion() {
        return cancelacion;
    }

    public void setCancelacion(Cancelacion cancelacion) {
        this.cancelacion = cancelacion;
    }
    
    
    
    
    
    
}
