package kodlama.o.HRMS.Business.Abstract;

import java.util.List;

import kodlama.o.HRMS.Entity.Concrete.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
