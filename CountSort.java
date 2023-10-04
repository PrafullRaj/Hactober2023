// Use Case: When the range of number is very small.Here we have considered the range is from 0 to 256.
// Time Complexity: O(n)

 public static void sortArray(int inputArr[])  
    { 
        int size = inputArr.length;  
        int sortedArr[] = new int[size];  
  
        // Create countArr that will store count of occurrence of each number and initialize it with 0  
        int countArr[] = new int[256];  
        for (int i = 0; i < 256; ++i) {  
            countArr[i] = 0;  
        }  
        for (int i = 0; i < size; ++i)  
            ++countArr[inputArr[i]];  
   
        for (int i = 1; i <= 255; ++i)  
            countArr[i] += countArr[i - 1];  
   
        for (int i = size - 1; i >= 0; i--) {  
            sortedArr[countArr[inputArr[i]] - 1] = inputArr[i];  
            --countArr[inputArr[i]];  
        }  
   
        for (int i = 0; i < size; ++i)  
            inputArr[i] = sortedArr[i];  
            
        System.out.print("Sorted numbers in the array is:");  
   
        for (int i = 0; i < inputArr.length; ++i)  
            System.out.print(inputArr[i]);  
    }  
