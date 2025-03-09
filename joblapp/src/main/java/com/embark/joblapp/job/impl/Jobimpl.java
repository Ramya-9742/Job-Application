package com.embark.joblapp.job.impl;
import com.embark.joblapp.job.JobService;

import com.embark.joblapp.job.Job;
import com.embark.joblapp.job.JobRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

//import java.util.ArrayList;
//import java.util.Iterator;
@Service
public class Jobimpl implements JobService{
	

	//private List<Job> jobs=new ArrayList<>();
	JobRepository jobRepository;
	public Jobimpl(JobRepository jobRepository)
	{
		this.jobRepository=jobRepository;
	}
	private Long nextId=1L;
	@Override
	public List<Job> findAll()
	{
		return jobRepository.findAll();
	}
	@Override
	public void createJob(Job job)
	{
		job.setId(nextId++);
		jobRepository.save(job);
	}
	@Override
	public Job getbyId(Long id)
	
	{
		jobRepository.findById(id).orElse(null);
		return null;
	}
	
	public boolean deleteJobById(Long id)
	{
		try {
			
      jobRepository.deleteById(id);
			return true;
		}
			catch(Exception e)
			{
				return false;
			}
		}
		

	@Override
	public boolean updateJob(Long id, Job updatedJob)
	{
		Optional<Job> jobOptional=jobRepository.findById(id);
		if(jobOptional.isPresent())
		{
				Job job=jobOptional.get();
		
				job.setTitle(updatedJob.getTitle());
				job.setDescription(updatedJob.getDescription());
				job.setMinSalary(updatedJob.getMinSalary());
				job.setMaxSalary(updatedJob.getMaxSalary());
				job.setLoc(updatedJob.getLoc());
				return true;
			}
				
		
		return false;
	}
}



	
	

	