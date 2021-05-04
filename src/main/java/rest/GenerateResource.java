/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.sun.org.apache.bcel.internal.generic.NEW;
import dtos.CourseDTO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import rest.provider.Provider;
import entities.Course;
import facades.CourseFacade;
/**
 * REST Web Service
 *
 * @author PC
 */
@Path("generate")
public class GenerateResource extends Provider{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenerateResource
     */
    public GenerateResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenerateResource
     * @return an instance of java.lang.String
     */
   
    @Override
    public Response getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response getAll() {
        CourseDTO cdto1=new CourseDTO("Vesuvio","pizza",10,"lækker");
        CourseDTO cdto2=new CourseDTO("to","pizza",20,"lækkeytrr");
        CourseDTO cdto3=new CourseDTO("tre","pizza",30,"lgreækker");
        CourseDTO cdto4=new CourseDTO("fire","pizza",40,"lækkerytr");
        CourseFacade facade=CourseFacade.getCourseFacade(EMF);
        facade.createCourse(cdto1);
                facade.createCourse(cdto2);
        facade.createCourse(cdto3);
        facade.createCourse(cdto4);

    }

    @Override
    public Response create(String jsonBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response update(int id, String jsonBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
