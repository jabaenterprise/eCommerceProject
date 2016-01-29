package factories;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import shop.DataBase;
import user.Client;

public class ClientFactory extends DataBase{
	
	public ClientFactory(){
		
	}
	
	public static Client createClient(String name, String password, String email){
		
		for(int i = 0; i < clients.size();i++){
			if(email.equals(clients.get(i).geteMail())){
				System.out.println("this client is already in the system ");
				return clients.get(i);
			}
		}
		if(password.length()>4&&password.matches(".*\\d+.*")&&password.matches(".*[A-Z]+.*")&&password.matches(".*[a-z]+.*")&&name.length()>0){
			return new Client(email, password, name);
			
		}
		else		
		return null;		//we must figure out how what to return because this null leads to null pointer exception 
		
	}

}
