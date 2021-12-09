package kodlama.o.HRMS.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>{

}
