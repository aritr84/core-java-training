public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,40,1,3,65,0,-1,58,3,42,4};
		int max = 0;
		int len = arr.length;
        while(len > 0) {
        	for(int i = 1 ; i < len;i++) {
        		if(arr[max] < arr[i]) max = i;
        	}
        	swap(arr,len-1,max);
        	len--;
        }
        for(int ele: arr) {
			System.out.print(ele + " ");
		}
	}
	
	private static void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}

}