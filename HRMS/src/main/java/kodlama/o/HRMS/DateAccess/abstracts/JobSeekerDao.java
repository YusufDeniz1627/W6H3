package kodlama.o.HRMS.DateAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.concretes.JobSeekers;

public interface JobSeekerDao extends JpaRepository<JobSeekers, Integer>{
	JobSeekers findByEmail(String Email);
	JobSeekers findByNationalitionId(String TcNo);
}
