
 
public class Main extends JavaProjectEulerLib {
 
 
        public static void main(String[] args) {
                long rez = 0;
                long checkedValue = 600851475143l;
                long divisor = 2;
                while ((divisor * divisor) <= checkedValue) {
                        if ((checkedValue % divisor) == 0) {
                                rez = divisor;
                                System.out.println("diviseur " +divisor);
                                checkedValue /= divisor;
                                System.out.println("reste : "+checkedValue);
                        }
                        else {
                                divisor++;
                        }
                }
               
                if (checkedValue != 1) {
                        rez = checkedValue;
                }
               
                System.out.println(rez);
        }
}