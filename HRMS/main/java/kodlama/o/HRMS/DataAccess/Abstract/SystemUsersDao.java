package kodlama.o.HRMS.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.o.HRMS.Entity.Concrete.SystemUsers;

public interface SystemUsersDao extends JpaRepository<SystemUsers, Integer>{

}
