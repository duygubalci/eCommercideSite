package eCommerceSite.dataAccess.concretes;

import java.util.List;

import eCommerceSite.dataAccess.abstracts.UserDao;
import eCommerceSite.entities.concretes.User;

public class HibernetUserDao implements UserDao{
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile Veritabanına eklendi.." + user.getFirstName());
		
	}

	@Override
	public boolean getMail(User user) {
		return false;
	}

	@Override
	public boolean getPassword(User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
