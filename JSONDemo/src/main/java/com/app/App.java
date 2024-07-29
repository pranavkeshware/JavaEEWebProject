package com.app;

import java.io.*;
import com.app.enttity.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws StreamReadException, DatabindException, IOException
    {
        //predefined class
    	ObjectMapper mapper = new ObjectMapper();
    	Student myStudent = mapper.readValue(new File("data/sample.json"),Student.class);
    			System.out.println("Student Name = "+myStudent.getFirstName()+" "+myStudent.getLastName());
    			
    			System.out.println("IsActive = "+myStudent.isActive());
    }
}
