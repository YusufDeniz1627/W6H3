package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.JobPositionService;
import kodlama.o.HRMS.DataAccess.Abstract.JobPositionDao;
import kodlama.o.HRMS.Entity.Concrete.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao positionDao;
	@Autowired
	public JobPositionManager(JobPositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.positionDao.findAll();
	}

}
