package exampleB;

import org.osgi.service.component.annotations.*;

import exampleC.ExampleC;

@Component
public class ExampleB {

  private ExampleC c;
  
	public void doB()
	{
	  c.doC();
	}

}
