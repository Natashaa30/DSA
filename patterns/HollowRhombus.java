import java.util.*;

public class HollowRhombus{

    public static void main(String args[]){
        int n = 4;
        hollow_rhombus(n);
    }

    public static void hollow_rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if( i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}