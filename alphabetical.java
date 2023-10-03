import java.util.Arrays;
import java.util.Scanner;
public class alphabetical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter String :");
    String s = sc.nextLine().toLowerCase();
    char[] c = s.toCharArray(); 
    Arrays.sort(c);
    System.out.println(c); 
    }
}
