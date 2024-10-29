import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String rstr = "";
        int[] start = new int[4]; // start index
        int[] end = new int[4]; // end index
        for (int i = 0; i < str.length(); i++) {
            start[i] = scan.nextInt();
            end[i] = scan.nextInt();
        }
        for (int i = 0; i < str.length(); i++) {
            if (i <= start[i]) {
                rstr = str.charAt(i)+rstr;
                    if (i == end[i]) {
                        System.out.println("("+rstr+")");
                    }
                }
        }
    }
}