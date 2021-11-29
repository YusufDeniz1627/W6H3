package kodlama.o.HRMS.Business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.o.HRMS.DateAccess.abstracts.JobSeekerDao;

@Service
public class JobSeekerCheckManager {
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerCheckManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}
}
