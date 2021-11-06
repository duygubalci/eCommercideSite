package eCommerceSite.core;

import eCommerceSite.entities.concretes.User;
import eCommerceSite.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements GoogleService{

	@Override
	public void signUpWithGoogle(User user) {
		JGoogleManager manager = new JGoogleManager();
		manager.logIn(user);
		
	}

}
