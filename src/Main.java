import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        int topValue = myStack.peek();
        System.out.println("The last int to be added to the stack is: " + topValue);

        int removedValue = myStack.pop();
        // myStack.pop();
        // myStack.pop();

        System.out.println("The last int to be removed from the stack is: " + removedValue);

        System.out.println("The current values stored in the stack are: " + myStack);

        System.out.println("Is the stack currently empty?: " + myStack.isEmpty());

        if (!myStack.isEmpty())
            System.out.println("You currently have " + myStack.size() + " value stored in the stack");
        else
            System.out.println("Sorry, you currently have " + myStack.size() + " values stored in the stack, " +
                    "please feel free to add more items");

    }
}