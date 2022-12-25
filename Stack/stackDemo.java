package Stack;

import java.util.Scanner;

public class stackDemo {
    int size;
    int arr[];
    int top;

    stackDemo(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element:" + pushedElement);
        } else {
            System.out.println("Stack is full !");
        }
    }

    void getMax() {
        // return this.maxValues[this.size - 1];

    }

    public int pop() {
        if (!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];

        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }

    public int peek() {
        if (!this.isEmpty())
            return arr[top];
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stackDemo StackCustom = new stackDemo(n);
        while (n > 0) {
            int opval = sc.nextInt();
            switch (opval) {
                case 1:
                    int insertValue = sc.nextInt();
                    StackCustom.push(insertValue);
                    break;
                case 2:
                    StackCustom.pop();
                case 3:

                default:
                    break;
            }
        }
        sc.close();
    }
}
