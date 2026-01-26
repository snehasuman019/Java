/* /
public class Jagged {
    public static void main(String[] args){
        int arr[][] = new int [2][];
        arr[0] = new int[3];
        arr[1] = new int[2];

        int count = 0;
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                System.out.println();
        }
            }
        }
    }
*/

/* /
// Here row i has i + 1 columns.
class Jagged{
    public static void main(String[] args){
        int r = 5;
        int arr[][] = new int[r][];
        //creating a 2D array such that first row has 1 element, second row has 2 elements and so on.
        for(int i = 0; i<arr.length; i++)
            arr[i] = new int[i + 1];
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;
        System.out.println("Contents of 2D Jagged Array");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    */
/* /
// user input jagged array
import java.util.Scanner;
public class Jagged{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scan.nextInt();
        int jaggedArray[][] = new int[numberOfArrays][];
        for(int i = 0; i < numberOfArrays; i++){
            System.out.print("Enter the size of sub-array" + (i+1) + ": ");
            int sizeOfArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfArray];
            // Initialize the sub-array elements
        for(int m =0;i<numberOfArrays;i++){
               System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
          
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scan.nextInt();
            }
        }
        
        // Print the elements of the jagged array
        System.out.println("\nThe jagged array is:");
        for (int m = 0; i < jaggedArray.length; i++) {
            
          	for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
        scan.close(); 
        }
    }
}
*/


import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of sub-arrays: ");
        int numberOfArrays = scan.nextInt();
        
        // 1. Declare the main array
        int[][] jaggedArray = new int[numberOfArrays][];
        
        // 2. Define the size of each sub-array
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int sizeOfArray = scan.nextInt();
            jaggedArray[i] = new int[sizeOfArray];
        }

        // 3. Initialize the elements (Now outside the previous loop)
        for (int i = 0; i < numberOfArrays; i++) {
            System.out.println("Enter the elements of sub-array " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = scan.nextInt();
            }
        }

        // 4. Print the elements
        System.out.println("\nThe jagged array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}