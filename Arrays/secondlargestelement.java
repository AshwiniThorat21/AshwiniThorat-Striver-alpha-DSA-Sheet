package Arrays;
import java.util.*;

//  brute force Approch ===== total time Complexity - O(n log n) + O(n) ≈ O(n log n).
class Solution {
    public int getSecondLargest(int[] arr) {
        
     int n = arr.length;
     
     // sort the Array - Nlog(N)
     Arrays.sort(arr);
     int largest = arr[n-1];
     int second_large = -1;
      
      // time complexity - o(N)
      for(int i=n-2; i>=0; i--){
          if(arr[i] != largest){
              second_large = arr[i];
              break;
          }
      }
      
      return second_large;
       
    }
}


/// BETTER APPRORCH O(n)+O(n)=O(2n)≈O(n)
class Solution1 {
    public int getSecondLargest(int[] arr) {
        
     int n = arr.length;
     int largest = arr[0];
     
     // find Largest = o(N)
     for(int i=1; i<n; i++){
         if(arr[i] > largest){
             largest = arr[i];
         }
     }
     
     //now find second largest
     
     int second_large = -1;
     
     for(int j=0; j<n; j++){
         if( arr[j] > second_large && arr[j] != largest){
             second_large = arr[j];
         }
     }
     
     return second_large;
       
    }
}

// optimal Approch = o(n)
class Solution3 {
    public int getSecondLargest(int[] arr) {
    
       int n = arr.length;
       int largest = arr[0];
       int second_largest = -1;
       
       for(int i=0; i<n; i++){
           if(arr[i] > largest){
               second_largest = largest;
               largest = arr[i];
           }
           else if(arr[i] > second_largest && arr[i] < largest){
               second_largest = arr[i];
           }
       }
       
       return second_largest;
    }
}




