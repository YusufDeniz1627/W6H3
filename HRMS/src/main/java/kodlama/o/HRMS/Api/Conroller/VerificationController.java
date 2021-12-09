package kodlama.o.HRMS.api.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.Abstract.VerificationService;
import kodlama.o.HRMS.Entity.Concrete.Verification;

@RestController
@RequestMapping("/verificationcontroller")
public class VerificationController {
	private VerificationService verificationService;

	public VerificationController(VerificationService verificationService) {
		super();
		this.verificationService = verificationService;
	}
	
	@GetMapping("/getall")
	public List<Verification> getAll(){
		return this.verificationService.getAll();
	}
}
