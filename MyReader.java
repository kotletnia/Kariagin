import java.util.*;

public class Myreader {
	Scanner scanner;
	public MyReader () {
		Scanner scanner = new Scanner (System.in);
	}
	
	public int read () {
		return scanner.nextInt ();
	}
}