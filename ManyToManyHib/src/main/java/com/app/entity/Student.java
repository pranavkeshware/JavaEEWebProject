package com.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name="student2")
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name="fname")
		private String firstName;
		@Column(name="lname")
		private String lastName;
		@Column(name="email")
		private String email;
		@ManyToMany(cascade={CascadeType.PERSIST,
						     CascadeType.MERGE,
						     CascadeType.DETACH,
						     CascadeType.REFRESH
				            }
				   )
		@JoinTable
	   (
	   name="course_student",
	   joinColumns=@JoinColumn(name="student_id"),
	   inverseJoinColumns=@JoinColumn(name="course_id")
	   )
		private List<Course> Courses;
		
		
		
		public Student(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}

		public Student() {}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<Course> getCourses() {
			return Courses;
		}

		public void setCourses(List<Course> courses) {
			Courses = courses;
		}
		
		public void addCourse(Course theCourse)
		{
			if(Courses==null)
			{
				Courses= new ArrayList<Course>();
			}
		Courses.add(theCourse);
        }

		@Override
		public String toString() {
			return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
		}

	}
