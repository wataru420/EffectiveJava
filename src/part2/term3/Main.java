package part2.term3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Elvis.INSTANCE.sing();
		
		Sid.getInstance().sing();
		
		Bob.INSTANCE.sing();
		
		/*
		Class c = Class.forName("part2.term3.Elvis");
		Constructor[] cons = c.getDeclaredConstructors();
		for(Constructor con: cons){
			con.setAccessible(true);
		}
		Object obj = cons[0].newInstance(null);
		*/

	}

}
