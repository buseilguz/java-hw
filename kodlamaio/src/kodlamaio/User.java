package kodlamaio;

public class User {
	
int id;
String name;
String surname;
double phoneNumber;

public User()
{
	System.out.println("Kullan�c� olu�turuldu!");
}
public User(int id,String name,String surname,double phoneNumber) {
	this.id=id;
	this.name=name;
	this.surname=surname;
	this.phoneNumber=phoneNumber;
			
}


}
