/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author fusm-cat-palmira
 */ 

@Entity
public class Monitor implements Serializable{
    
    @Id
    private Long codigo;    
    
    @Column (length = 50,nullable = false,unique = false)   
    private String nombres;
    
    @Column (length = 50,nullable = false,unique = false)  
    private String apellidos;
    
    @Column (length = 60,nullable = false,unique = true)  
    private String correo;
    
    @Column (length = 30,nullable = false,unique = false)  
    private String telefono;
    
    @Column (length = 30,nullable = false,unique = false)  
    private String password;
    
    @Column(nullable = false, unique = false)
    private Float hrs_acumuladas;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private LinkedList<Horario> horarios;

    
    
    public Monitor() {
    }


    public Monitor(Long id, String nombres, String apellidos, String correo, String telefono, String password, Float hrs_acumuladas) {
        this.codigo = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.password = password;
        this.hrs_acumuladas = hrs_acumuladas;
    }

    public LinkedList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(LinkedList<Horario> horarios) {
        this.horarios = horarios;
    }

    
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getHrs_acumuladas() {
        return hrs_acumuladas;
    }

    public void setHrs_acumuladas(Float hrs_acumuladas) {
        this.hrs_acumuladas = hrs_acumuladas;
    }
    
    
    
}
