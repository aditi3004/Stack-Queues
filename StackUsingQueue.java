


class queue {
    int data;
    int size;
    int arr[];
    int front = 0;
    int rear = 0;

    public queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return (rear == front);
    }

    public boolean isFull() {
        return (rear == (size - 1));
    }

    public void push(int data) {
        if (!isFull()) {
            arr[rear] = data;
            rear++;
        } else {
            System.out.println("full queue");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int dequeueData = arr[front];
            front++;
            return dequeueData;
        } else {
            System.out.println("full queue");
            return -1;
        }
    }

    public void StackBuild() {
        System.out.println("enter the data: ");

    }
}

class stack {
    int size;
    int Stack[];
    int top;

    stack(int size) {
        this.size = size;
        this.Stack = new int[size];
        this.top = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        // top==-1 will be true if the stack is empty
        return (top == -1);
    }

    // is full
    public boolean isFull() {
        // size-1 is the top that implies the stack is full now!!
        return (size - 1 == top);
    }

    // push the data on the top of the stack;
    public void push(int data) {
        if (!isFull()) {
            top++;
            Stack[top] = data;
        } else {
            System.out.println("stack is full!!");
        }
    }

    // pop the element(we can delete only the top element
    public int pop() {
        if (!isEmpty()) {
            int popIndex = top;// storing the top item for deleting it
            top--; // this deletes
            return Stack[popIndex];
        } else {
            System.out.println("Stack is empty!!");
            return -1;
        }
    }

    // peeking the element
    public int peek() {
        if (!this.isEmpty()) {
            System.out.println(Stack[top]);
            return Stack[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // displaying

}

public class StackUsingQueue {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 4, 5, 6, 7, 8 };
        stack st1 = new stack(arr1.length);
        stack st2 = new stack(arr1.length);

        for (int i = 0; i < arr1.length; i++) {
            st1.push(arr1[i]);
            st2.push(st1.pop());
            st2.peek();
        }

    }
}
