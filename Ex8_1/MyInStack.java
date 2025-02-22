package Ex8_1;

public class MyInStack {
    private int[] contents;
    private int tos;

    public MyInStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public void push(int element) {
        contents[++tos] = element;
    }

    public int pop() {
        return contents[tos--];
    }

    public int peek() {
        // Chưa kiểm tra rỗng
        return contents[tos];
    }

    public boolean isEmpty() {
        return (tos < 0);
    }

    public boolean isFull() {
        return (tos == contents.length - 1);
    }
}