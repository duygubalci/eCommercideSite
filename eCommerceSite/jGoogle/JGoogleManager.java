package eCommerceSite.jGoogle;

import eCommerceSite.entities.concretes.User;

public class JGoogleManager {
	public void logIn(User user){
		System.out.println("Kullanıcı : " + user.getFirstName()+" adı ve  Google Hesabı ile üye oldu..");
	}

}
