package kodlama.o.HRMS.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.o.HRMS.DateAccess.abstracts.JobPositionDao;
import kodlama.o.HRMS.Entity.concretes.JobPosition;

@Service
public class JobPositionManager {
JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}


	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}
}
