package eCommerceSite.dataAccess.abstracts;


import eCommerceSite.entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean getMail(User user);
	boolean getPassword(User user);
	//void delete(User user);
	//User get(int id);

}
