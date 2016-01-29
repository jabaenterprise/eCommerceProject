package factories;

import admin.Admin;

public class AdminFactory {

	private static final int MIN_PASSWORD_LENGTH = 4;
	
	public static Admin createAdmin(String email, String password){
		//matches emails Aja83483r@aasc.bg
		if(password.length()>MIN_PASSWORD_LENGTH&&password.matches(".*\\d+.*")&&password.matches(".*[A-Z]+.*")&&password.matches(".*[a-z]+.*")
				&&email.matches("^[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z]{3,6}\\.[a-zA-Z]{2,}")){
			return new Admin(email, password);
		}
		return null;
	}
}
