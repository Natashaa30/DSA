import java.util.*;

public class FloydsTriangle{

    public static void main(String args[]){
        int n = 5;
        floyds_triangle(n);
    }

    public static void floyds_triangle(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(f + " ");
                f++;
            }
            System.out.println();
        }
    }
}