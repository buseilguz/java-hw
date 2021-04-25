package kodlamaio;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println("Yeni kullanýcý eklendi.");
	}
	public void deleteUser(User user) {
		System.out.println(user.name +" isimli kullanýcý silindi");
	}
	public void updateUser(User user) {
		System.out.println(user.name+" isimli kullanýcý bilgileri güncellendi");
	}
}
