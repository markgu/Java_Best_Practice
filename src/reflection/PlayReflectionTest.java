package reflection;

import java.lang.reflect.InvocationTargetException;

import generics.Dog;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.hamcrest.core.*;

public class PlayReflectionTest {
	
	@Test
	public void test() throws SecurityException, NoSuchMethodException{
		PlayReflection pr = new PlayReflection();
		pr.setClass(Dog.class);
		//assertEquals("Dog.class", pr.returnClass(Dog.class)); 
		//assertEquals("", pr.getContructor());
		try {
			assertEquals("", pr.getInstance());
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
