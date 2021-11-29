package kodlama.o.HRMS.Business.abstracts;
import com.sun.net.httpserver.Authenticator.Result;

import kodlama.o.HRMS.Entity.concretes.JobSeekers;

public interface JobSeekerCheckService {
	Result checkFirstName(JobSeekers jobSeeker);

	Result checkLastName(JobSeekers jobSeeker);

	Result checkNationalityId(JobSeekers jobSeeker);

	Result checkBirthYear(JobSeekers jobSeeker);

	Result checkEmail(JobSeekers jobSeeker);

	Result checkPassword(JobSeekers jobSeeker);

	Result checkRepeatPassword(JobSeekers jobSeeker);

	Result uniqueEmail(JobSeekers jobSeeker);

	Result TcNo(JobSeekers jobseeker);
}
