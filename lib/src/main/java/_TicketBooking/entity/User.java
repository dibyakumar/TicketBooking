package _TicketBooking.entity;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
	
	public static void main(String[] args) throws Exception{
		User user = new User();
		user.display();
	}
	
		
		ObjectMapper mapper = new ObjectMapper();
		public void display() throws Exception{
			
			File file = new File("src/main/java/_TicketBooking/localDb/user.json");
			   if (file.exists()) {
		            System.out.println("File exists at the specified path: " + file.getPath());
		        } else {
		            System.out.println("File does not exist at the specified path: " + file.getPath());
		        }
		List<UserEntity> readValue = mapper.readValue(file,new TypeReference<List<UserEntity>>() {
		});
		
		for(UserEntity userEntity: readValue) {
			System.out.println(userEntity.toString());
		}
		}

}
