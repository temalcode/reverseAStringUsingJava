import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();    
        String result = reverse(userInput);
        System.out.println(result);
    }

    public static String reverse(String s) {

        char arr[] = new char[s.length()];
        int arrayIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            
            arr[arrayIndex] = s.charAt(i);
            arrayIndex++;

        }

        String reversedstring = "";
        for (int i = 0; i < s.length(); i++) {
            reversedstring = reversedstring + arr[i];
        }

        return reversedstring;
    }
}