import java.util.*;

public class InvertedStar{
    public static void main(String args[]){
        System.out.println("Enter number of lines in star - n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inverted_star(n);
    }

    public static void inverted_star(int n){
        for(int i = n;  i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}