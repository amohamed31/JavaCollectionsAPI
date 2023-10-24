public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.push(40);
        arrayStack.push(50);
        arrayStack.pop();
    }
}
