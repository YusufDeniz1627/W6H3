package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.JobSeekersService;
import kodlama.o.HRMS.DataAccess.Abstract.JobSeekersDao;
import kodlama.o.HRMS.Entity.Concrete.JobSeekers;
@Service
public class JobSeekersManager implements JobSeekersService{
	
	private JobSeekersDao jobSeekersDao;
	
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public List<JobSeekers> getAll() {
		return this.jobSeekersDao.findAll();
	}

}
