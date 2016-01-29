package factories;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import shop.DataBase;
import user.Client;

public class ClientFactory extends DataBase{
	private static final int MIN_PASSWORD_LENGTH = 4;
	
	public ClientFactory(){
		
	}
	
	public static Client createClient(String name, String password, String email){
		
		for(int i = 0; i < clients.size();i++){
			if(clients.get(i)==null){
				break;
			}
			if(email.equals(clients.get(i).geteMail())){
				System.out.println("this client is already in the system.");
				return null;
			}
		}
		if(password.length()>MIN_PASSWORD_LENGTH&&password.matches(".*\\d+.*")&&password.matches(".*[A-Z]+.*")&&password.matches(".*[a-z]+.*")&&name.length()>0){
			return new Client(email, password, name);
			
		}
		else		
		return null;
		
	}

}
