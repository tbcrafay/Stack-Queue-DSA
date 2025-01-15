import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i);
        }
        System.out.println("Elements in stack: " + stack); 

        // Pop elements from the stack
        System.out.println("\nPopping elements from the stack:");
        while (!stack.empty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Check for Emptiness
        System.out.println("\nIs Stack empty? " + stack.empty()); // Output: true
    }
}
