package kodlamaio;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Yeni kullanıcı eklendi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.name +" isimli kullanıcı silindi");
	}
	public void updateUser(User user) {
		System.out.println(user.name+" isimli kullanıcı bilgileri güncellendi");
	}
}
