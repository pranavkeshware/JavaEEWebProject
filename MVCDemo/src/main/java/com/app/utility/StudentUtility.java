package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Student;

public class StudentUtility {
     
	public static List<Student> getstudentList()
	{
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student("Pranav","Keshware","panditkeshware@gmail.com"));
		l.add(new Student("Deepesh","Gupta","deepeshgupta@gmail.com"));
		l.add(new Student("Bhupesh","Verma","bhupeshverma@gmail.com"));
		l.add(new Student("Shreyansh","Dubey","dubeyshreyansh@gmail,com"));
		l.add(new Student("Kartik","Pandita","kartikguru@gmmail.com"));
		return l;
	}
}
