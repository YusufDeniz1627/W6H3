package kodlama.o.HRMS.api.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.Abstract.JobPositionService;
import kodlama.o.HRMS.Entity.Concrete.JobPosition;
@RestController
@RequestMapping("/jobposition")
public class JobPositionController {
	private JobPositionService jobPositionService;

	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll() {
		return this.jobPositionService.getAll();
	}
}
