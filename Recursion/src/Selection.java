//Recursive program to find combinations
public class Selection {
	int C(int n, int r) {
		if(r==0||n==r)
			return 1;
		else
			return C(n-1,r-1)+C(n-1,r);
	}
	public static void main(String[] args) {
		Selection s= new Selection();
		System.out.println(s.C(60, 4));
	}
		
}
