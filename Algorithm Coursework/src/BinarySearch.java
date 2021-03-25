
public class BinarySearch { 
    
    public static boolean binarySearch(int arr[], int left, int right) { 
    	
        if (left <= right) { 
            int mid = (left + right) / 2; 
            int x = mid + arr[arr.length-1]/2;
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) {
                return true; 
                
            } else if (arr[mid] > x) {         	
                return binarySearch(arr, left, mid - 1);   
                
            } else {
            	return binarySearch(arr, mid + 1, right); 
            }
              
        } 
        return false; 
    }
}