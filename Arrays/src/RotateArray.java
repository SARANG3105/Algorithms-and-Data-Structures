import java.util.Arrays;

public class RotateArray {
	public int[] rotate(int [] arr, int d, int n){
		int i=0; int temp=0;
		for(int j=0;j<d;j++){
			for(i=0;i<arr.length-1;i++){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		return arr;
	}

	public static void main(String args[]){
		RotateArray a= new RotateArray();
		int [] arr={1,2,3,4,5,6,7};
		int n= arr.length;
		int d= 3;
		System.out.println(a.rotate(arr, d, n));
		System.out.println(Arrays.toString(arr));

	}
}
