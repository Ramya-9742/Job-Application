package com.embark.joblapp.job;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="Job_Table")
public class Job {

	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	     
		private long Id;
		private String title;
		private String minSalary;
		private String maxSalary;
		private String description;
		private String Location;
		
		public Job()
		{
			
		}
		
		public Job(Long id, String description,String title, String minSalary, String maxSalary, String Location) {
			
			this.Id = id;
			this.title = title;
			this.minSalary = minSalary;
			this.maxSalary = maxSalary;
			this.description = description;
			this.Location=Location;
		}
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getMinSalary() {
			return minSalary;
		}
		public void setMinSalary(String minSalary) {
			this.minSalary = minSalary;
		}
		public String getMaxSalary() {
			return maxSalary;
		}
		public void setMaxSalary(String maxSalary) {
			this.maxSalary = maxSalary;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getLoc() {
			return Location;
		}
		public void setLoc(String Location) {
			this.Location=Location;
		}
		
		
		

	}


