import java.util.*;

public class HalfPyramid{
    public static void main(String args[]){
        System.out.println("Enter number of lines in star - n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        half_pyramid(n);
    }

    public static void half_pyramid(int n){
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}