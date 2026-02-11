import java.util.Scanner;
public class Patterns {
    public static void main(String[] args){
/*         // Pattern 1
        // *
        // * *
        // * * *
        int n = 3;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pattern 2
        //     *
        //    * *
        //   * * *
        //  * * * *
        int m =4;
        for(int i =1; i<=m; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        
    // Pattern 3
    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     *
    int o = 5;
    for(int i = 1; i <= o; i++) {
        for(int j = 1; j <= o - i; j++){
            System.out.print(" ");

        }
        for(int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = o - 1; i >= 1; i--){
        for(int j = 1; j <= o - i; j++){
            System.out.print(" ");

        }
        for(int k = 1; k <= i; k++){
            System.out.print("* ");
        }
        System.out.println();
        }
    
    // Pattern 4
    // 1     1
    //  2   2
    //   3 3
    //    4
    //   3 3
    //  2   2
    // 1     1
    int p = 4;
    for(int i=1;i<=p;i++){
        for(int j =1;j<i;j++){
            System.out.print(" ");
        }
        System.out.print(i);
        if(i!=p){
            for(int k=1;k<=2*(p-i)-1;k++){
                System.out.print(" ");
            } 
            System.out.print(i);
        }
        System.out.println();
    }
    for (int i =p-1;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        System.out.print(i);
    
    for(int k=1;k<=2*(p-i)-1;k++){
        System.out.print(" ");
    }
    System.out.print(i);
    System.out.println();
}

// Pattern 5
//  A
//C B D
//  E
//G F H
//  I
char ch = 'A';
for(int i=1;i<=5;i++){
    if(i%2!=0){
        for(int j=1;j<=2;j++){
            System.out.print(" ");
        }
        System.out.print(ch);
        ch++;
    }
    else{
        for(int j=1;j<=1;j++){
            System.out.print(" ");
        }
        System.out.print(ch);
        ch++;
        System.out.print(" ");
        System.out.print(ch);
        ch++;
        System.out.print(" ");
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}

// Pattern 6
// butterfly pattern
//*   *
//** **
//*****
//** **
//*   *
int q = 5;
for(int i=1;i<=q;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
    for(int k=1;k<=2*(q-i);k++){
        System.out.print(" ");
    }
    for(int l=1;l<=i;l++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=q-1;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");

    }
    for(int k=1;k<=2*(q-i);k++){
        System.out.print(" ");
    }
    for(int l=1;l<=i;l++){
        System.out.print("*");
    }
    System.out.println();
}*/
/* 
int n = 3; // Number of rows for the upper half

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Stars on left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Stars on right
            for (int j = 1; j <= i; j++) {
                // If it's the middle row (max stars), avoid double printing
                if (spaces == 0 && j == n) continue; 
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // Stars on left
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in middle
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Stars on right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
       
    }
*/
// Pattern 7
//*****
//*   *
//*   *
//*   *
//*****

/*/
int n = 5; // Size of the square

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Logic: Print '*' if it's the first or last row, 
                // OR the first or last column.
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    // Otherwise, print a space
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

*/

        int rows = 4; // height of the triangle
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces inside
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
