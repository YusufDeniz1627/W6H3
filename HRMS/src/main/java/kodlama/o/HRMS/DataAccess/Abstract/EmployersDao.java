package kodlama.o.HRMS.DataAccess.Abstract;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
