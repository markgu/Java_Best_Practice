package reflection;

import generics.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PlayReflection {
	private Class aClass;
	
	public void setClass(Class Klass){
		this.aClass = Klass;
	}
	
	public Class returnClass(){
		return this.aClass.getClass();
	}
	
	public static void printMethods(Object obj){
		Class klass = obj.getClass();
		Method[] methods = klass.getClass().getDeclaredMethods();
		for(Method method: methods){
			System.out.println("method = " + method.getName());
		}
	}
	
	public Constructor getContructor() throws SecurityException, NoSuchMethodException{
		return this.aClass.getConstructor();		
	}
	
	public Object getInstance() throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return getContructor().newInstance();
	}
	
	public Field getField(String fieldName) throws SecurityException, IllegalArgumentException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		return getInstance().getClass().getField(fieldName);	
	}
	
	public void setField(String fieldName, Object obj, Object value) throws SecurityException, IllegalArgumentException, NoSuchFieldException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		Field field = getInstance().getClass().getField(fieldName);	
		field.setAccessible(true);
		field.set(obj, value);
	}
	
	
	public static void main(String args[]) throws SecurityException, NoSuchMethodException{
		Dog dog = new Dog();
		PlayReflection.printMethods(dog);
		
		Class aClass = Dog.class;
		Constructor constructor = aClass.getConstructor();
		try {
			Dog newDog = (Dog)constructor.newInstance();
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
