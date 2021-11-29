package kodlama.o.HRMS.Core.abstracts;

import com.sun.net.httpserver.Authenticator.Result;

public interface BusinessRuler {
	public static Result run(Result... logics) {
		for (Result logic : logics) {
			if(logic != null) {
				return logic;
			}
			
		}
		return null;
	}
}
