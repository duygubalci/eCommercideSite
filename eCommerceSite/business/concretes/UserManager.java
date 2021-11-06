package eCommerceSite.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSite.business.abstracts.UserCheckService;
import eCommerceSite.business.abstracts.UserService;
import eCommerceSite.business.abstracts.VerifyMailService;
import eCommerceSite.dataAccess.abstracts.UserDao;
import eCommerceSite.entities.concretes.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;
	private VerifyMailService veryfyMailService;
	private UserDao userDao;
	List<User> userList = new ArrayList<User>();

	public UserManager(UserCheckService userCheckService, VerifyMailService veryfyMailService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.veryfyMailService = veryfyMailService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		
		if(userList.contains(user) == false) {
			if (userCheckService.checkPassword(user) && userCheckService.checkName(user)
					&& userCheckService.checkLastName(user) && userCheckService.checkMail(user)
					&& veryfyMailService.checkMailVerify(user)) {

				// userList = userDao.add(user);
				System.out.println("Üyeliğiniz gerçekleştirildi.");
				userList.add(user);
				userDao.add(user);
				veryfyMailService.sendToVerifyMail(user);
				veryfyMailService.verifyMail(user);
			}
		}
		else {
			 veryfyMailService.checkMailVerify(user);
		}

	}

	@Override
	public void signIn(User user) {
		if(userList.contains(user) == false ) {
			System.out.println("Kaydınız bulunmamaktadır. Giriş yapabilmek için önce kayıt yaptırınız.. : " + user.getFirstName());
		}
		
		 if(userList.contains(user) == true && user.getPassword() !=null) {
		  System.out.println("Girişiniz yapıldı.. Hoş geldiniz : " +
		  user.getFirstName());
		 }
		// TODO Auto-generated method stub
		
	}

}
