package kodlama.o.HRMS.api.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.Abstract.JobSeekersService;
import kodlama.o.HRMS.Entity.Concrete.JobSeekers;
@RestController
@RequestMapping("/jobseekers")
public class JobSeekersController {
	private JobSeekersService jobSeekersService;

	public JobSeekersController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	@GetMapping("/getall")
	public List<JobSeekers> getAll() {
		return this.jobSeekersService.getAll();
	}
}
