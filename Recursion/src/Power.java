//Recursion basic function to calculate exponential numbers.
public class Power {
	public static long raise(long base, int exp) {
            if(exp==0) 
            	return 1;
            else 
            	return base * raise(base,exp-1);
	}
	public static void main(String args[]) {
		System.out.println(Power.raise(2, 50));
		
	}

}
