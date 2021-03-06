package eCommerceSite.dataAccess.abstracts;


import java.util.List;

import eCommerceSite.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	User get(int id); //kullanıcı döndürebilir..
	List<User> getAll(); //tüm kullanıcı listesi 

}
