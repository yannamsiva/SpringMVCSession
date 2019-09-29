import org.springframework.beans.factory.annotation.Autowired;

public class Servlet {

	@Autowired
	private Service service1;


/*public Servlet(Service service1) {
	super();
	this.service1 = service1;
}
*/


public void setService(Service service1) {
	this.service1 = service1;
}

public void serviceMethod()
{
	service1.serviceMethod();
}

}
