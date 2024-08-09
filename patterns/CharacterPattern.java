import java.util.*;

public class CharacterPattern{

    public static void main(String args[]){
        System.out.println("Enter number of lines in schar pattern - n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char_pattern(n);
    }

    public static void char_pattern(int n){
        char ch = 'A';
        for(int i = 1;  i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}