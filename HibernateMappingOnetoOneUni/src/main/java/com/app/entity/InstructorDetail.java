package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="youtube")
	private String youtube_Channel;
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail() {}

	public InstructorDetail(String youtube_Channel, String hobby) {
		super();
		this.id = id;
		this.youtube_Channel = youtube_Channel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutube_Channel() {
		return youtube_Channel;
	}

	public void setYoutube_Channel(String youtube_Channel) {
		this.youtube_Channel = youtube_Channel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtube_Channel=" + youtube_Channel + ", hobby=" + hobby + "]";
	}
    
	
}
