package eCommerceSite.business.abstracts;

import eCommerceSite.entities.concretes.User;

public interface VerifyMailService {
	void sendToVerifyMail(User user);
	void verifyMail(User user);
	boolean checkMailVerify(User user);

}
