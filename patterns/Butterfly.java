import java.util.*;

public class Butterfly{

    public static void main(String args[]){
        int n = 8;
        butterfly(n);
    }

    public static void butterfly(int n){
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            for(int j = 1; j <= n-2*i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n/2; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            
            for(int j = 1; j <= n-2*i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}