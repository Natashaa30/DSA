import java.util.*;

public class Diamond{

    public static void main(String args[]){
        int n = 7;
        diamond(n);
    }

    public static void diamond(int n){
        for(int i = n/2; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n-2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n/2; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n-2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}