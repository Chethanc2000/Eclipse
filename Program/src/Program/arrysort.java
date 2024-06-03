package Program;

public class arrysort {

	static void checkSortingOrder(int arr[], int n) {
        if (n <= 1) {
            System.out.println("The array is sorted in increasing order");
        }
        
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                increasing = false;
            }
            if (arr[i - 1] < arr[i]) {
                decreasing = false;
            }
        }
        
        if (increasing) {
        	System.out.println("The array is sorted in increasing order");
        } else if (decreasing) {
        	System.out.println("The array is sorted in decreasing order");
        } else {
        	System.out.println("The array is not sorted");
        }
		
	
    }
    
    public static void main(String[] args) {
        int arr[] = {50,40,30,20,10};
        int n = arr.length;
        checkSortingOrder(arr, n);
        
    }
}
