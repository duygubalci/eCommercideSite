package eCommerceSite.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import eCommerceSite.entities.concretes.User;

public interface UserCheckService {

	boolean checkMail(User user);
	boolean checkPassword(User user);
	boolean checkName(User user);
	boolean checkLastName(User user);
	//List<String> emailList= new ArrayList<String>();
}
