package Controlador;

import Logica.Horario;
import Persistencia.HorarioFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

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
    
    public void guardar(){
        
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
    
}
