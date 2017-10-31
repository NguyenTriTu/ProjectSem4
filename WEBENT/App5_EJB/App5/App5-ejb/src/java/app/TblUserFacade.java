/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Apple
 */
@Stateless
public class TblUserFacade extends AbstractFacade<TblUser> {

    @PersistenceContext(unitName = "App5-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUserFacade() {
        super(TblUser.class);
    }

    public TblUser findUser(String userName){
      return em.find(TblUser.class, userName);
    }

    @Override
    public void edit(TblUser entity) {
        super.edit(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(TblUser entity) {           
        super.remove(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(TblUser entity) {
        super.create(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<TblUser> viewAll(){
        Query query = em.createNamedQuery("TblUser.findAll");
        return query.getResultList();
    }
    
}
