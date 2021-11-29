package kodlama.o.HRMS.Business.abstracts;

import java.util.List;

import kodlama.o.HRMS.Entity.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
