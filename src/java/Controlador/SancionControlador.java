/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Sancion;
import Persistencia.SancionFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author paulker
 */
@Named(value = "sancionControlador")
@SessionScoped
public class SancionControlador implements Serializable {

    /**
     * Creates a new instance of SancionControlador
     */
    @EJB
    private SancionFacade sancionfacade;
    
    private Sancion sancion = new Sancion();
    
    public SancionControlador() {
    }
    
}
