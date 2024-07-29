package com.app.entity;
import javax.persistence.*;
@Entity
@Table(name="instructor_detail")
public class InstructorDetail{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String youtube_channel;
	@Column
	private String hobby;
	
	public InstructorDetail() {}
	
	public InstructorDetail(String youtube_channel, String hobby) {
		super();
	
		this.youtube_channel = youtube_channel;
		this.hobby = hobby;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutube_channel() {
		return youtube_channel;
	}

	public void setYoutube_channel(String youtube_channel) {
		this.youtube_channel = youtube_channel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String toString() {
		return "InstructorDetails [id=" + id + ", youtube_channel=" + youtube_channel + ", hobby=" + hobby + "]";
	}
	
	
}