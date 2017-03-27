package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response;  
@Path("/product")  
public class Student{  
    @POST  
    @Path("/add")  
    public Response addUser(  
        @FormParam("id") int id,  
        @FormParam("name") String name,  
        @FormParam("price") float price) {  
   
        return Response.status(200)  
            .entity(" Product added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Price: "+price)  
            .build();  
    }  
}  

