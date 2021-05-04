/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.CourseDTO;
import entities.Course;
import entities.CourseRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import utils.EMF_Creator;

/**
 *
 * @author PC
 */
public class CourseFacadeTest {
    
    private static EntityManagerFactory emf;
    private static CourseRepository facade;
    public static Course course1, course2;

    public CourseFacadeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
       emf = EMF_Creator.createEntityManagerFactoryForTest();
       facade = CourseFacade.getCourseFacade(emf);
    }

   @BeforeEach
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        course1 = new Course("Vesuvio","Pizza",10,"Lækker pizza...");
        course2 = new Course("en saftig ting","burger",6,"uhmmmm.");
        try {
            em.getTransaction().begin();
            em.createNamedQuery("Course.deleteAllRows").executeUpdate();
            em.persist(course1);
            em.persist(course2);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
     @Test
    void createCourse() {
        CourseDTO expected = new CourseDTO("name", "type",4,"des");
        CourseDTO actual = facade.createCourse(expected);
        assertEquals(expected.getName(), actual.getName());
        assertNotNull(actual.getId());
    }
     @Test
    void getAll() {
        List<CourseDTO> expected = new ArrayList<>();
        expected.add(new CourseDTO(course1));
        expected.add(new CourseDTO(course2));

        List<CourseDTO> actual = facade.getAll();
        assertEquals(expected.size(), actual.size());
    }
}
