package Controlador;

import Logica.Horario;
import Persistencia.HorarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author paulker
 */
@Named(value = "horarioControlador")
@SessionScoped
public class HorarioControlador implements Serializable {

    /**
     * Creates a new instance of HorarioControlador
     */
    @EJB
    private HorarioFacade horarioFacade;
    
    private Horario horario = new Horario();
    
    public HorarioControlador() {
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    public boolean camposVacios(Horario h){
        boolean salida = false;
        
        if(h.getCodigo()==null){
            salida = true;            
        }else if(h.getCodigo()==null){
            salida = true;
        }
        
        return salida;
    }
    
    public void registrar() {
        try {
            horarioFacade.create(this.horario);
            horario = new Horario();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,e.getMessage(),"Debe completar todos los campos obligatorios"));
        }
    }
    
    public void eliminar() {
        try {
            horarioFacade.remove(this.horario);
            horario = new Horario();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public void editar() {
        try {
            horarioFacade.edit(this.horario);
            horario = new Horario();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Campos obligatorios","Debe completar todos los campos obligatorios"));
        }
    }
    
    public List<Horario> findall() {
            return horarioFacade.findAll();
    }
    
    public Horario find() {
            return horarioFacade.find(this.horario);
    }
    
}
