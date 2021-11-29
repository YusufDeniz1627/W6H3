package kodlama.o.HRMS.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.net.httpserver.Authenticator.Result;

import kodlama.o.HRMS.Business.abstracts.JobSeekerService;
import kodlama.o.HRMS.Entity.concretes.JobSeekers;
@RestController
@RequestMapping("api/jobseeker")
public class JobSeekerKontroller {
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerKontroller(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	
	@PostMapping("/addjobseeker")
	public Result add(@RequestBody JobSeekers jobseeker) {
		return this.jobSeekerService.add(jobseeker);
	}
}
