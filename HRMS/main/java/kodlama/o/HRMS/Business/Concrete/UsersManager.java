package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.UsersService;
import kodlama.o.HRMS.DataAccess.Abstract.UsersDao;
import kodlama.o.HRMS.Entity.Concrete.Users;
@Service
public class UsersManager implements UsersService{
	private UsersDao usersDao;

	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	@Override
	public List<Users> getAll() {
		return this.usersDao.findAll();
	}

}
