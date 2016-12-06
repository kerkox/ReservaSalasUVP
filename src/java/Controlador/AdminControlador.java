/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Admin;
import Persistencia.AdminFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author fusm-cat-palmira
 */
@Named(value = "adminControlador")
@SessionScoped
public class AdminControlador implements Serializable {

    /**
     * Creates a new instance of AdminControlador
     */
    
    private Admin admin = new Admin();
    
    @EJB
    private AdminFacade adminFacade;
    
    public AdminControlador() {
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


    public void editar(Admin admin) {
        try {
            adminFacade.edit(admin);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }  

}
