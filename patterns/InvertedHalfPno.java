import java.util.*;

public class InvertedHalfPno{

    public static void main(String args[]){
        int n = 6;
        inverted_halfPyramid_with_numbers(n);
    }

    public static void inverted_halfPyramid_with_numbers(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1 ; j <= i; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}