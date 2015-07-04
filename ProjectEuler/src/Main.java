
 
public class Main extends JavaProjectEulerLib {
 
 
        public static void main(String[] args) {
        	int result = 0;
        	for(int i = 999; i >= 100; i--){
        		for(int j = 999; j >= 100; j--){
        			if(i*j > result && isPalindromic(String.valueOf(i*j))){
        				result = i*j;
        			}
        		}
        	}
        	System.out.println(result);
        }
}