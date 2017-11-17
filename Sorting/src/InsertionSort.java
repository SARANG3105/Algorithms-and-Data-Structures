import java.util.Arrays;

public class InsertionSort {
	static int[] sort(int[] arr) {
	   int max=0, min=0,key=0,i=0,j=0;
       for(j=1;j<arr.length;j++){
          key= arr[j];
           i=j-1;
           while(i>=0 && arr[i]>key){
               arr[i+1]=arr[i];
               i=i-1;
               arr[i+1]=key;
           }
       }
      return arr;
	}
	public static void main(String args[]) {
		int[] arr = {5,4,3,1,2}; 
		System.out.println(Arrays.toString(InsertionSort.sort(arr)));
		
	}
}
