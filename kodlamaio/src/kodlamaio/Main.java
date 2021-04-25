package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C# ",150);
		Course course2=new Course(2,"Java",150);
		Course course3=new Course(3,"sql ",100);
		Course course4=new Course(4,"C++ ",150);
		Course[] courses= {course1,course2,course3,course4};
		
		for (Course course : courses) {
			System.out.println(course.courseName);
		}
		
		User user1=new User(1,"Buse","İlgüz",541000000);
		User user2=new User(2,"Alper","Cengiz",542000000);
		User user3=new User(3,"Meral","İlgüz",546000000);
		User user4=new User(4,"Celal","İlgüz",544000000);
		User[] users= {user1,user2,user3,user4};
		
		for (User user : users) {
			System.out.println(user.name+" "+user.surname);
		}
		CourseManager courseManager=new CourseManager();
		UserManager userManager= new UserManager();
		courseManager.createCourse(course4);
		courseManager.deleteCourse(course1);
		courseManager.updateCourse(course2);
		
		userManager.addUser(user1);
		userManager.deleteUser(user4);
		userManager.updateUser(user2);
		
		

	}

}
