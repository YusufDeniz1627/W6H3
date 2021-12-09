package kodlama.o.HRMS.api.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.Abstract.SystemUsersService;
import kodlama.o.HRMS.Entity.Concrete.SystemUsers;

@RestController
@RequestMapping("/systemusers")
public class SystemUsersController {
	private SystemUsersService systemUsersService;

	public SystemUsersController(SystemUsersService systemUsersService) {
		super();
		this.systemUsersService = systemUsersService;
	}
	@GetMapping("/getall")
	public List<SystemUsers> getAll(){
		return this.systemUsersService.getAll();
	}
}
