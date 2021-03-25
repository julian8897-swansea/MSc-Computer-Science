import java.util.*;
  
public class Solution {
    
    public static boolean q1_1_solution(int[] data) {
        // Your code here - you must return a boolean
    	boolean found = false;
    	int i = 0;
    	
    	while (!found && i < data.length) {
    		if (data[i] == i*i) {
    			found = true;
    		}
    		   		
    		i++;
    	}
    	
    	return found;
    }

    public static boolean q1_2_solution(int[] data) {
        // Your code here - you must return a boolean
    	boolean found = false;
    	int i = 0;
    	int j = data.length - 1;
    	
    	while (!found && i < j) {
    		if (data[i] + data[j] == i + j && j == i+1) {
    			found = true;
    			
    		} else if (data[i] + data[j] < i + j) {
    			i++;
    			
    		} else {
    			j--;
    		}    		
    	}
    	
        return found;
    }    


    public static boolean q1_3_solution(int[] data) {
        // Your code here - you must return a boolean
    	return BinarySearch.binarySearch(data, 0, data.length-1);
    	
    }

    public static boolean q1_4_solution(int[] data) {
        // Your code here - you must return a boolean
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	for (int i = 0; i < data.length; i++) {
    		if (data[i] == i) {
    			stack.push(data[i]);
    		}
    	}	
    	if (stack.isEmpty()) {
    		return false;
    	}
    		
    	if (stack.size() >= 2) {
    		return true;
    		
    	} else {
    		return false;
    	}
    	   	
    }

    public static int[][] q2_solution(int[][] data) {
        // Your code here - you must return a boolean
//    	int[] arr1 = {4};
//    	int[] arr2 = {4 ,1};
//    	int[] arr3 = {5, 4, 1};
//    	int[][] testArray = {arr1, arr2, arr3};
    	HeapSort.sort(data);
    	
    	for (int i = 0; i < data.length; i++) {
    		if (data[i].length == 1) {
    			continue;
    		}	
    		
    		if (data[i].length == 2) {
    			if (data[i][0] < data[i][1]) {
        			
        			int temp = data[i][0];
        			data[i][0] = data[i][1];
        			data[i][1] = temp;
    			}
    			continue;
    		}	
    		
    		
    		if (data[i][0] < data[i][1]) {
    			
    			int temp = data[i][0];
    			data[i][0] = data[i][1];
    			data[i][1] = temp;
    		}
    		
    		if (data[i][0] < data[i][2]) {
    			
    			int temp = data[i][0];
    			data[i][0] = data[i][2];
    			data[i][2] = temp;
    		}
    		
    		if (data[i][1] < data[i][2]) {
    			
    			int temp = data[i][1];
    			data[i][1] = data[i][2];
    			data[i][2] = temp;
    		} 
    	}
    		
    	
    	return data;
    }        
}