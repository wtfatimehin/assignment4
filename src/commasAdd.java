import acm.program.*;



public class commasAdd extends ConsoleProgram {
	
	public void run() {
		
		while(true) {
			String numbers = readLine("Enter A String. Must be numeric");
			
			if(numbers.length() == 0) {
				break;
			} else 
				System.out.println(commasAddToNumString(numbers));
		}
		
	}
	
	
	private String commasAddToNumString(String numbers) {
		String str1 = "";
		int selector4Letter = numbers.length();
		
		if(numbers.length() >= 4) {
			
			for(int k = 0; k < numbers.length(); k++) {
					selector4Letter--;
					
					if(selector4Letter < 0) {
						selector4Letter = 0;
					}
					if(k % 3 == 0 && k != 0) {
						str1 = str1 + (",");
					}
					str1 = str1 + numbers.charAt(selector4Letter);
			}
			
			return (new StringBuilder(str1).reverse().toString());
		}
		else {
			return numbers;
		}
	}
}
