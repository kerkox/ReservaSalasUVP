/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Reserva;
import Persistencia.ReservaFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author paulker
 */
@Named(value = "reservaControlador")
@SessionScoped
public class ReservaControlador implements Serializable {

    /**
     * Creates a new instance of ReservaControlador
     */
    @EJB
    private ReservaFacade reservaFacade;
    private Reserva reserva = new Reserva();
    
    
    public ReservaControlador() {
    }
    
}
