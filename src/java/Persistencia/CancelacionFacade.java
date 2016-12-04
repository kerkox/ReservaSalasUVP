/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Cancelacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fusm-cat-palmira
 */
@Stateless
public class CancelacionFacade extends AbstractFacade<Cancelacion> {

    @PersistenceContext(unitName = "SoftwareReservaSalasUVPPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CancelacionFacade() {
        super(Cancelacion.class);
    }
    
}
