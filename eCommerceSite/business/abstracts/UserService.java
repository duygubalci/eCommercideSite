package eCommerceSite.business.abstracts;


import eCommerceSite.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void signIn(User user);
	//List<String> userList= new ArrayList<String>();
	//void mailSend(User user);
	//boolean clickLink(User user);

}
