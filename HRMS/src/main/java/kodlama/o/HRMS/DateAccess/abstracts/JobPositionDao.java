package kodlama.o.HRMS.DateAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
