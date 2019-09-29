import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
Student sd=(Student)context.getBean("st");
System.out.println("Student Number : "+sd.getSno());
System.out.println("Student Name   : "+sd.getSname());
System.out.println("Student Address: "+sd.getSadd());
	}

}
