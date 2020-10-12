import acm.program.*;
import acm.util.*;



public class DeleteCharacterFromString extends ConsoleProgram {
	
	public void run() {
		
		System.out.println(removeAllInstances("Peter Piper picked a peck of pickled peppers. A peck of pickled peppers Peter Piper picked.", 'p'));
	}
	
	public String removeAllInstances(String str, char ch) {
	
		String thing = "";
		
			for (int i = 0; i < str.length(); i++) {
				if(ch != str.charAt(i)) {
			
					thing = thing + str.charAt(i);
				}
			}
			return thing;
	}
	
	
}
