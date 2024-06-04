public class CountingSort { 
    public static void main(String[] args) { 
        int nilai1 = 30; 
        int nilai2 = 10; 
        int nilai3 = 50; 
        int nilai4 = 20; 
        int nilai5 = 40; 
        int nilai6 = 60;  
 
        int[] arr = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6}; 
 
        System.out.println("Data sebelum diurutkan:"); 
        printArray(arr); 
         
        countingSort(arr); 
 
        System.out.println("\nData sebelum diurutkan:"); 
        printArray(arr); 
    } 
 
    public static void countingSort(int[] arr) { 
        int max = getMax(arr); 
        int min = getMin(arr);  
        int range = max - min + 1; 
 
        int[] count = new int[range]; 
        int[] output = new int[arr.length]; 
 
        for (int i = 0; i < arr.length; i++) { 
        } 
 
        for (int i = 1; i < count.length; i++) { 
            count[i] += count[i - 1]; 
        } 
 
        for (int i = arr.length - 1; i >= 0; i--) { 
            output[count[arr[i] - min] - 1] = arr[i]; 
            count[arr[i] - min]--; 
        } 
 
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = output[i]; 
        } 
    } 
    public static int getMax(int[] arr) { 
        int max = arr[0]; 
        for(int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) { 
                max = arr[i]; 
            } 
        } 
        return max; 
    } 
 
    public static int getMin(int[] arr) { 
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] < min) { 
                min = arr[i]; 
            } 
        } 
        return min; 
    } 
 
    public static void printArray(int[] arr) { 
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println(); 
    } 
}