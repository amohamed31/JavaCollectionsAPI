import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;

    public ArrayStack()
    {
        this(DEFAULT_CAPACITY);
    }
    public ArrayStack(int initialCapacity)
    {
        this.top = 0;
        this.stack = (T[]) (new Object[initialCapacity]);
    }
    public void push(T element)
    {
        if (size() == stack.length)
            expandCapacity();

        stack[top] = element;
        top++;
    }
    private void expandCapacity()
    {
        stack= Arrays.copyOf(stack, stack.length*2);
    }
    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        return top == 0;
    }
    public T pop() throws EmptyStackException
    {
        if (isEmpty())
            throw new EmptyStackException();

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }
    public T peek() throws EmptyStackException
    {
        if (isEmpty())
            throw new EmptyStackException();

        return stack[top-1];
    }
}
