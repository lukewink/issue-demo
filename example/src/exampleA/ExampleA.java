package exampleA;

import org.osgi.service.component.annotations.*;

import exampleB.ExampleB;


@Component
public class ExampleA {

  private ExampleB b;
  
	public void doA()
	{
	  b.doB();
	}

}
