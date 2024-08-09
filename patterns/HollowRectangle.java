import java.util.*;

public class HollowRectangle {

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Total rows in rectangle : ");
        int total_row = sc.nextInt();
        System.out.println("Total columns in rectangle : ");
        int total_col = sc.nextInt();
        hollow_rectangle(total_row,total_col);
        
    }

    public static void hollow_rectangle(int n, int m){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || i == n ){
                    System.out.print("*");
                }
                else if( j == 1 || j == m ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}