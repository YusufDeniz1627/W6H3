package kodlama.o.HRMS.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.abstracts.JobPositionService;
import kodlama.o.HRMS.Entity.concretes.JobPosition;

@RestController
@RequestMapping("api/jobpositions")
public class JobPositionController {
	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}
}
