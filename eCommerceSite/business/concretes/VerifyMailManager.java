package eCommerceSite.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSite.business.abstracts.VerifyMailService;
import eCommerceSite.entities.concretes.User;

public class VerifyMailManager implements VerifyMailService{
	
	List<String> emailList = new ArrayList<String>();
	

	@Override
	public void sendToVerifyMail(User user) {
		System.out.println("Doğrulama linki :" + user.geteMail()+" adresine gönderildi" );
	}
	
	@Override
	public void verifyMail(User user) {
		
		emailList.add(user.geteMail());
		System.out.println("Doğrulama " + user.geteMail()+" adresi için başarılı bir şekilde yepıldı..");
		
	}

	@Override
	public boolean checkMailVerify(User user) {
	
		boolean flag=true;
		if(emailList.contains(user.geteMail())) {
			System.out.println("Bu email adresi ile daha önceden kayıt yapılmıştır.. email adresi : " + user.geteMail()); 
			flag = false;
		}else {
			emailList.add(user.geteMail());
			flag = true;
		}
		return flag;
	}

	

	



}
