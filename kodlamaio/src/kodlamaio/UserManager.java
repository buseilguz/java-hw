package kodlamaio;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Yeni kullan�c� eklendi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.name +" isimli kullan�c� silindi");
	}
	public void updateUser(User user) {
		System.out.println(user.name+" isimli kullan�c� bilgileri g�ncellendi");
	}
}
