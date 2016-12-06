/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author paulker
 */
@Named(value = "monitorControlador")
@SessionScoped
public class MonitorControlador implements Serializable {

    /**
     * Creates a new instance of MonitorControlador
     */
    public MonitorControlador() {
    }
    
}
