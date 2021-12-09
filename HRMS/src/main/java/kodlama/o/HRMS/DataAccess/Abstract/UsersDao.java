package kodlama.o.HRMS.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
	
}
