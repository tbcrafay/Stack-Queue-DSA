import java.util.*;

public class ColorStack {

    public static void main(String[] args) {
        Stack<String> originalStack = new Stack<>();
        Stack<String> tempStack = new Stack<>();

        // Add random color balls to the original stack
        originalStack.push("Yellow");
        originalStack.push("Green");
        originalStack.push("Orange");
        originalStack.push("Yellow");
        originalStack.push("Red");

        System.out.println("Original stack: " + originalStack);

        // Get user input for the color to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color to remove: ");
        String colorToRemove = scanner.nextLine();

        // Remove the chosen color balls and store remaining balls in tempStack
        while (!originalStack.isEmpty()) {
            String color = originalStack.pop();
            if (!color.equals(colorToRemove)) {
                tempStack.push(color); 
            }
        }

        // Recreate the original stack order in the tempStack
        Stack<String> updatedStack = new Stack<>();
        while (!tempStack.isEmpty()) {
            updatedStack.push(tempStack.pop()); 
        }

        System.out.println("Updated stack: " + updatedStack);
    }
}
