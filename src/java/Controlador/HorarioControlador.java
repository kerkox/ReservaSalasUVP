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
    
}
