import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*BeanFactory factory=new XmlBeanFactory(new ClassPathResource("/beans.xml"));
factory.getBean("sb");
*/
ApplicationContext context=new ClassPathXmlApplicationContext("/beans.xml");		
	Servlet s=(Servlet)context.getBean("servletRef");
	s.serviceMethod();
	}

}
