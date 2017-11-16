
public class Permute {
	static int c=0;
	void recPermute(String count, String s) {

		if(s.equals(""))
			System.out.println(count);
		else {
			for(int i=0; i<s.length(); i++) {
				c++;
				String a= count+String.valueOf(s.charAt(i));
				String b= s.substring(0, i)+s.substring(i+1);
			
				recPermute(a, b);

			}
		}		
	}
	void permute(String s) {
		recPermute("", s);

	}
	public static void main(String[] args) {
		Permute str= new Permute();
		str.permute("abc");
		System.out.println();
	}

}
