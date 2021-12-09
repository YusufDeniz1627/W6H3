package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.EmployersService;
import kodlama.o.HRMS.DataAccess.Abstract.EmployersDao;
import kodlama.o.HRMS.Entity.Concrete.Employers;

@Service
public class EmployersManager implements EmployersService{

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}


	@Override
	public List<Employers> getAll() {
		return this.employersDao.findAll();
	}
	
}
