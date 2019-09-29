/*

AutoWiring
==============
Autowiring means automatically injecting the dependencies
Instead of manually configuring the injection we done it automatically by using auto wiring
To implement autowiring we use autowire attribute of <bean> tag...

no   ---->it wont allow autowiring....
ByName
ByType
Constructor
autodetect
*/
public class Service {
public void serviceMethod()
{
	System.out.println("Service.serviceMethod()Called");
}
}
