


public class JavaProjectEulerLib {

	public static boolean isPalindromic(String str){
		boolean isPala = false;
		StringBuilder strB = new StringBuilder(str);
		String strRev = strB.reverse().toString();
		if(strRev.equals(str))isPala = true;
		
		return isPala;
	}
	
	public static boolean isPrime(double nbr){
		boolean test = true;
			
			for(int i = 1; i < nbr; i++){
				if(nbr%i == 0)
					test = false;
				
				
			}
		
		return test;
	}

}
