package kodlama.o.HRMS.api.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.o.HRMS.Business.Abstract.UsersService;
import kodlama.o.HRMS.Entity.Concrete.Users;

@RestController
@RequestMapping("/users")
public class UsersController {
		private UsersService usersService;

		public UsersController(UsersService usersService) {
			super();
			this.usersService = usersService;
		}
		@GetMapping("/getall")
		public List<Users> getAll(){
			return this.usersService.getAll();
		}
}
