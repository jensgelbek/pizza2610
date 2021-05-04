/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dtos.CourseDTO;
import java.util.List;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author PC
 */
public interface CourseRepository {

    public CourseDTO getById(int id) throws WebApplicationException;

    public List<CourseDTO> getAll() throws WebApplicationException;

    public CourseDTO createCourse(CourseDTO courseDTO) throws WebApplicationException;

}