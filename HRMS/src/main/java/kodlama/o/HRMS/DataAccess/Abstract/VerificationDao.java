package kodlama.o.HRMS.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.Verification;

public interface VerificationDao extends JpaRepository<Verification, Integer>{

}
