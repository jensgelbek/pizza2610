/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
public class RenameMeDTO {
    private Integer id;
    private String str1;
    private String str2;

    public RenameMeDTO(String dummyStr1, String dummyStr2) {
        this.str1 = dummyStr1;
        this.str2 = dummyStr2;
    }
    
    public static List<RenameMeDTO> getDtos(List<RenameMe> rms){
        List<RenameMeDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new RenameMeDTO(rm)));
        return rmdtos;
    }


    public RenameMeDTO(RenameMe rm) {
        this.id = rm.getId();
        this.str1 = rm.getDummyStr1();
        this.str2 = rm.getDummyStr2();
    }
 */
package dtos;

import entities.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class CourseDTO {
     private Integer id;
    private String name;
    private String type;
    private int price;
    private String description;

    public CourseDTO(String name, String type, int price, String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    public CourseDTO (Course c){
        this.id=c.getId();
        this.name = c.getName();
        this.type = c.getType();
        this.price = c.getPrice();
        this.description = c.getDescription();
    }
    
    public static List<CourseDTO> getDtos(List<Course> cs){
        List<CourseDTO> cdtos = new ArrayList();
        cs.forEach(c->cdtos.add(new CourseDTO(c)));
        return cdtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
