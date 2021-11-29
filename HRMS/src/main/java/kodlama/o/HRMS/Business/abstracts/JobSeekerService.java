package kodlama.o.HRMS.Business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlama.o.HRMS.Core.results.DataResult;
import kodlama.o.HRMS.Entity.concretes.JobSeekers;

public interface JobSeekerService {
	Result add(JobSeekers jobseeker);
	DataResult<List<JobSeekers>> getAll();
}
