package kodlama.o.HRMS.Business.Abstract;

import java.util.List;

import kodlama.o.HRMS.Entity.Concrete.JobSeekers;

public interface JobSeekersService {
	List<JobSeekers> getAll();
}
