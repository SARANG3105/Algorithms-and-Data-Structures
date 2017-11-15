//This is a recursive binary search for sorted int arrays.
public class BinarySearch {
	int BSearch(int[] arr, int start, int end, int key) {
		int mid=end+ (start-end)/2;	
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]<key )
			return BSearch(arr, mid+1, end, key);
		else
			return BSearch(arr, start,mid-1, key);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
		int start=0;
		int end=arr.length;		
		int key= 15;
		BinarySearch search= new BinarySearch();
		System.out.println(search.BSearch(arr, start, end, key));
	}

}
