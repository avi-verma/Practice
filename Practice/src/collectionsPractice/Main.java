package collectionsPractice;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Avinash
 *
 */

 class Main {
	public static void main(String[] args) throws FileNotFoundException {
		try {
		SingletonPattern pattern=SingletonPattern.getObject();
		
	}finally {
		PrintStream out=new PrintStream("Avinash");
		System.setOut(out);
		
	}
	}
		


}
