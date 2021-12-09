package kodlama.o.HRMS.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
