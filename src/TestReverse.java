import java.util.Scanner;

public class TestReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String myString = input.nextLine();
        System.out.println(ReversingString.ReverseString(myString));
    }
}
