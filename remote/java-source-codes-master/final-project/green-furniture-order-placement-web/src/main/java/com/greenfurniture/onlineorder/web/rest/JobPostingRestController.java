package com.greenfurniture.onlineorder.web.rest;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenfurniture.onlineorder.domain.JobPosting;
import com.greenfurniture.onlineorder.jparepository.JobPostingRepository;

@RequestMapping("/api/rest")
@RestController
public class JobPostingRestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(JobPostingRestController.class);
	
	@Inject
	JobPostingRepository jobPostingRepositary;
	
	@GetMapping("/job_postings/{id}")
	public ResponseEntity<JobPosting> getOneAuthor(@PathVariable Integer id) throws URISyntaxException{
		
		LOG.debug("Rest request to get job posting with id :{} ",id);
		
		return Optional
		.ofNullable(jobPostingRepositary.findOneById(id))
		.map(jp -> new ResponseEntity<>(jp,HttpStatus.OK))
		.orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND))
		;
		
	}
	@GetMapping("/job_postings")
	public ResponseEntity<List<JobPosting>> getAllJobPostings()
	{
		LOG.debug("Rest request to get all job posting ");
		return new ResponseEntity<>(jobPostingRepositary.findAll(),HttpStatus.OK);
		
	}	
	
	@PostMapping("/job_postings")
	public ResponseEntity<Void> createJobPosting(@RequestBody JobPosting jobPosting) throws URISyntaxException{
		LOG.debug("Resuest to create job postings:{}",jobPosting);
				
		if(jobPosting.getId()!=null){
			return ResponseEntity
					.badRequest()
					.header("Failure", "use put for update")
					.build();
		}
		JobPosting jp =jobPostingRepositary.save(jobPosting);
		return ResponseEntity.created(new URI("/api/rest/job_postings/"+jp.getId())).build(); 
		
	}
	@PutMapping("/job_postings")
	public ResponseEntity<JobPosting> updateJobPosting(@RequestBody JobPosting jobPosting) throws URISyntaxException{
		//JobPosting jp = jobPostingRepositary.save(jobPosting);
		LOG.debug("Request to update with id:{}",jobPosting.getId());
		if(jobPosting.getId() != null) {
			return new ResponseEntity<>(jobPostingRepositary.save(jobPosting),HttpStatus.OK); 

		}else { 
			return ResponseEntity
					.badRequest()
					.header("Failure", "Existing posting should have an id use post methode for creating")
					.build();
		}
		
		 
	}
	
	
	@DeleteMapping("/job_postings/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) throws URISyntaxException{
		LOG.debug("Request to delete job posting with id:{}",id);
		jobPostingRepositary.deleteById(id);
		return new ResponseEntity< >(HttpStatus.OK);
	} 
	
	
	
}
