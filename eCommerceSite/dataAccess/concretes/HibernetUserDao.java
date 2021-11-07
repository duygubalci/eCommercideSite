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
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
