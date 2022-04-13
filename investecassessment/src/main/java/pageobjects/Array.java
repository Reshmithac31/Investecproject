package pageobjects;

public class Array {

	public static void main(String[] args) {
 
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 }; 
        int high = 0; 
        int secondhigh = 0;
        int low=0;
        int secondlow=0;
        for (int i = 0; i < arr.length; i++) 
        { 
            if (arr[i] > high) 
            { 
            	secondhigh = high; 
            	high = arr[i]; 
            } 
            else if (arr[i] > secondhigh) 
            { 
            	secondhigh = arr[i]; 
            } 
        } 
        for (int i = 0; i < arr.length; i++) 
        { 
            if (arr[i] > low) 
            { 
            	secondlow = low; 
            	low = arr[i]; 
            } 
            else if (arr[i] < secondlow) 
            { 
            	secondlow = arr[i]; 
            } 
            
        } 
        System.out.println("Second largest number is:" + secondhigh);
        System.out.println("Second lowest number is:" + secondlow);

	}

}
