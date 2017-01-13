import java.util.*;

public class Myreader {		//class name must be readable, MyReader
	Scanner scanner;
	public MyReader () {
		Scanner scanner = new Scanner (System.in);
	}
	
	public int read () {
		return scanner.nextInt ();
	}
}
