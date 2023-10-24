import java.util.Stack;
public class ReversingString {
    public static String ReverseString (String x) {
            Stack<Character> myStack = new Stack<>();

            for (int i = 0; i < x.length(); i++){
                myStack.push(x.charAt(i));
            }

            StringBuilder inputReversed = new StringBuilder();

            while (!myStack.isEmpty()){
                inputReversed.append(myStack.pop());
            }

            return inputReversed.toString();
     }
}