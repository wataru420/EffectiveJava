package part8.term46;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main2 {
	
	enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }

	
	
	/**
	 * 従来のFor文で間違えてしまう例その２
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection<Face> faces = Arrays.asList(Face.values());
		
		for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			for (Iterator<Face> j = faces.iterator(); j.hasNext();)
				System.out.println(i.next() + " " + j.next());
		
	}

}
