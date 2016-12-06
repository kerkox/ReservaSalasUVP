package Controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

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
    public HorarioControlador() {
    }
    
}
