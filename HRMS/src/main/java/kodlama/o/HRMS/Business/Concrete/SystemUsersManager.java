package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.SystemUsersService;
import kodlama.o.HRMS.DataAccess.Abstract.SystemUsersDao;
import kodlama.o.HRMS.Entity.Concrete.SystemUsers;
@Service

public class SystemUsersManager implements SystemUsersService{

	private SystemUsersDao systemUsersDao;
	
	public SystemUsersManager(SystemUsersDao systemUsersDao) {
		super();
		this.systemUsersDao = systemUsersDao;
	}

	@Override
	public List<SystemUsers> getAll() {
		return this.systemUsersDao.findAll();
	}

}
