/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Docente;
import Persistencia.DocenteFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author fusm-cat-palmira
 */
@Named(value = "docenteControlador")
@SessionScoped
public class DocenteControlador implements Serializable {

    /**
     * Creates a new instance of DocenteControlador
     */
    
    private Docente docente = new Docente();
    
    @EJB
    private DocenteFacade docentefacade;
    
    public DocenteControlador() {
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    
    
}
