package eCommerceSite.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSite.business.abstracts.UserCheckService;
import eCommerceSite.core.GoogleService;
import eCommerceSite.core.JGoogleManagerAdapter;
import eCommerceSite.dataAccess.abstracts.UserDao;
import eCommerceSite.entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	private JGoogleManagerAdapter adapter;
	
	public UserCheckManager(JGoogleManagerAdapter adapter) {
		super(); 
		this.adapter = adapter; 
		}
	 
	@Override
	public boolean checkMail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
		String regex2 = "^[\\w.+\\-]+@gmail\\.com$";
		
		Pattern pattern =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher =pattern.matcher(user.geteMail());
		
		Pattern pattern2 =Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher2 =pattern2.matcher(user.geteMail());
		
		
		if(matcher.matches() == false){ 
			System.out.println("Lütfen geçerli bir mail adresi giriniz.. Girilen mail adresi : " +
			user.geteMail()); 
		}
		 
		if(matcher2.matches() == true ) {
			adapter.signUpWithGoogle(user);
		}
		
		return matcher.matches();
	}

	@Override
	public boolean checkPassword(User user) {
		
		if(user.getPassword().length() < 6) {
			System.out.println("Lütfen geçerli bir Parola giriniz.. Minimum 6 karakter olmalıdır.. Girilen Parola uzunluğu : "	 + user.getPassword().length());
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean checkName(User user) {
		
		if(user.getFirstName().length() <= 2) {
			System.out.println("Lütfen geçerli bir isim giriniz.. Minimum uzunluk 2 olmalıdır.. Girilen ismin uzunluğu : " + user.getFirstName().length());
			return false;
		}else {
			return true;
		}

	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().length() <= 2) {
			System.out.println("Lütfen geçerli bir soyisim giriniz.. Minimum uzunluk 2 olmalıdır.. Girilen ismin uzunluğu : " + user.getLastName().length());
			return false;
		}else {
			return true;
		}
	}


}
