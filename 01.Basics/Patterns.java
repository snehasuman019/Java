import java.util.Scanner;
public class Patterns {
    public static void main(String[] args){
        // Pattern 1
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
}
}