import java.util.Arrays;
import java.util.Vector;



public class JavaProjectEulerLib {


	
	public static boolean isPrime(double nbr){
		boolean test = true;
			
			for(int i = 1; i < nbr; i++){
				if(nbr%i == 0)
					test = false;
				
				
			}
		
		return test;
	}

}
