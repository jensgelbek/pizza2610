/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.CourseDTO;
import entities.Course;
import entities.CourseRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author PC
 */
public class CourseFacade implements CourseRepository{

    
    private static CourseFacade instance;
    private static EntityManagerFactory emf;
    
    public static CourseFacade getCourseFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new CourseFacade();
        }
        return instance;
    }
    
    @Override
    public CourseDTO getById(int id) throws WebApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CourseDTO> getAll() throws WebApplicationException {
      EntityManager em = emf.createEntityManager();
       List<Course> courses = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
       return CourseDTO.getDtos(courses);
    }

    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) throws WebApplicationException {
       EntityManager em = emf.createEntityManager();
       Course c=new Course(courseDTO);
       try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
       return new CourseDTO(c);
    }
    
}
