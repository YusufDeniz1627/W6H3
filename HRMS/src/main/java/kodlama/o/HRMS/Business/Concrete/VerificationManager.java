package kodlama.o.HRMS.Business.Concrete;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.o.HRMS.Business.Abstract.VerificationService;
import kodlama.o.HRMS.DataAccess.Abstract.VerificationDao;
import kodlama.o.HRMS.Entity.Concrete.Verification;
@Service
public class VerificationManager implements VerificationService{
	private VerificationDao verificationDao;

	public VerificationManager(VerificationDao verificationDao) {
		super();
		this.verificationDao = verificationDao;
	}

	@Override
	public List<Verification> getAll() {
		return this.verificationDao.findAll();
	}

}
