package kodlamaio;

public class CourseManager {
public void createCourse(Course course) {
	System.out.println("Yeni kurs olu�turuldu.");
}
public void deleteCourse(Course course) {
	System.out.println(course.courseName +" isimli kurs silindii");
}
public void updateCourse(Course course) {
	System.out.println(course.courseName+" isimli kurs  g�ncellendi");
}

}
