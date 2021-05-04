/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.MenuDTO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author PC
 */
public class MenuFacade {
      private static MenuFacade instance;
    private static EntityManagerFactory emf;
    
    public static MenuFacade getMenuFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new MenuFacade();
        }
        return instance;
    }
    public MenuDTO getMenu(){
            CourseFacade cf=CourseFacade.getCourseFacade(emf);
            EntityManager em = emf.createEntityManager();
            MenuDTO menu;
            try
            {
                menu=new MenuDTO("PIZZA 2610", "Rødovres best pizzaria",cf.getAll() );
            }finally{
                em.close();
            }
            return menu;
    }       
}
