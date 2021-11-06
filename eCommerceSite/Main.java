package eCommerceSite;

import eCommerceSite.business.concretes.UserCheckManager;
import eCommerceSite.business.concretes.UserManager;
import eCommerceSite.business.concretes.VerifyMailManager;
import eCommerceSite.core.JGoogleManagerAdapter;
import eCommerceSite.dataAccess.concretes.HibernetUserDao;
import eCommerceSite.entities.concretes.User;
import eCommerceSite.jGoogle.JGoogleManager;

public class Main {

	public static void main(String[] args) {
	
		//UserService userService= new UserManager(new HibernetUserDao(), new JGoogleManagerAdapter());
		UserManager manager = new UserManager(new UserCheckManager(new JGoogleManagerAdapter()), new VerifyMailManager(), new HibernetUserDao());
		
		User user1 = new User(1, "Duygu", "Balcı", "duygu.balci@gmail.com", "1234567");
		User user2 = new User(1, "Engin", "Demiroğ", "engin@gmail.com", "12345");
		User user3 = new User(1, "aşş", "Bdd", "engingmail.com", "123456");
		//checkService.checkLastName(user1);
		manager.signUp(user1);
		manager.signUp(user1);
		manager.signUp(user2);
		manager.signUp(user3);
		manager.signIn(user1);
		manager.signIn(user2);
		manager.signIn(user1);
		

	}

}
