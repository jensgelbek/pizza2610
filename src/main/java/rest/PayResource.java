package rest;

import dtos.RenameMeDTO;
import entities.renameme.RenameMe;
import entities.renameme.RenameMeRepository;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.core.Response;
import rest.provider.Provider;
import facades.FacadeExample;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Todo Remove or change relevant parts before ACTUAL use
@Path("pay")
public class PayResource extends Provider {

    @Override
    public Response getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response create(String jsonBody) {
        return Response.ok("Thank you !!").build();
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
