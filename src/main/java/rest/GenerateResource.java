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
import java.util.ArrayList;
import java.util.List;
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
        List<CourseDTO> courses=new ArrayList<>();
        courses.add(new CourseDTO("Margherita","Pizza",4,"Tomato Sauce,Mozzarella and Basil"));
        courses.add(new CourseDTO("Funghi","Pizza",5,"Tomato Sauce, Mozzarella, Mushrooms and Thyme"));
        courses.add(new CourseDTO("Fiorentina","Pizza",6,"Tomato Sauce,Mozzarella, Parmesan, Egg and Fresh Spinach"));
        courses.add(new CourseDTO("Giardino","Pizza",6,"Tomato Sauce, Vegan Mozzarella, Mixed Peppers, Mushrooms and Double Basil"));
        courses.add(new CourseDTO("Formaggi","Pizza",5,"Tomato Sauce, Mozzarella, Parmesan, Mascarpone and Gorgonzola"));
        courses.add(new CourseDTO("Fumo","Pizza",6,"Tomato Sauce, Mozzarella, BBQ Sauce, Chicken and Onions"));
        courses.add(new CourseDTO("Regina","Pizza",7,"Tomato Sauce, Mozzarella, Parmesan, Ham, Mushrooms and Black Olivesh"));
        courses.add(new CourseDTO("Tropicali","Pizza",6,"Tomato Sauce, Mozzarella, Ham, Pineapple and Oreganol"));
        courses.add(new CourseDTO("Verona","Pizza",6,"Tomato Sauce, Mozzarella, Pepperoni, Pancetta Bacon and Green Chillies"));
        courses.add(new CourseDTO("Pepperoni","Pizza",6,"Tomato Sauce, Mozzarella and Double Pepperoni"));
        courses.add(new CourseDTO("Calabria","Pizza",6,"Tomato Sauce, Mozzarella, Mascarpone, Nduja Spicy Sausage and Rocket"));
        courses.add(new CourseDTO("Carne","Pizza",7,"Tomato Sauce, Mozzarella, Chicken, Beef, Pepperoni, Onions and  Rosemary"));
        courses.add(new CourseDTO("Pollo","Pizza",6,"Tomato Sauce, Mozzarella, Chicken, Mixed Peppers and Thyme"));
        courses.add(new CourseDTO("Roma","Pizza",6,"Tomato Sauce, Mozzarella, Gorgonzola, Pancetta Bacon and Mushrooms"));
        courses.add(new CourseDTO("Capra","Pizza",6,"White Pizza with Mozzarella, Goats Cheese, Black Olives and Rocket"));
        courses.add(new CourseDTO("Aglio","Pizza",4,"White Pizza with Mozzarella, Parmesan, Garlic and Rosemary"));
        CourseFacade facade=CourseFacade.getCourseFacade(EMF);
        for(CourseDTO courseDTO:courses){
            facade.createCourse(courseDTO);
        }
      
        return Response.ok("Menu generated").build();
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
