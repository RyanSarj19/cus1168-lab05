package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test 1: Operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        // Creates instance of ArrayStack named stack
        ArrayStack<Integer> stack = new ArrayStack<>();

        // Verifies stack is empty using isEmpty method
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push two elem to stack: 10 & 20
        stack.push(10);
        stack.push(20);

        // Verifies size of stack using size.()
        System.out.println("Size after pushing two elements: " + stack.size());

        // Prints stack statistics using getStats()
        System.out.println(stack.getStats());

        // Prints global statistics using the getGlobalStats()
        System.out.println(ArrayStack.getGlobalStats());

        // Adds top two eleme usingaddTopTwo()
        stack.addTopTwo();

        // Gets result of addition using pop()
        Integer result = stack.pop();

        // Prints result of addition
        System.out.println("Sum: " + result);

        // Test 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");
        // Creates instance of ArrayStack named resizeStack
        ArrayStack<Integer> resizeStack = new ArrayStack<>();

        // Push 15 elem to trigger resize (default cap: 10) using loop
        System.out.println("Pushing 15 elements to trigger resize...");
        for (int i = 1; i <= 15; i++) {
            resizeStack.push(i);
        }

        // Prints stack size after pushing 15 elem
        System.out.println("Stack size after pushing 15 elements: " + resizeStack.size());

        // Prints stack statistics using getStats()
        System.out.println(resizeStack.getStats());

        // Test 3: Multiple instances
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");
        // Creates instance of ArrayStack named floatStack
        ArrayStack<Double> floatStack = new ArrayStack<>();

        // Push three elem to floatStack: 1.5, 2.5, and 3.5
        floatStack.push(1.5);
        floatStack.push(2.5);
        floatStack.push(3.5);

        // Prints first stack statistics using getStats()
        System.out.println("First stack stats: " + stack.getStats());

        // Prints statistics for resizeStack and floatStack
        System.out.println("Second stack stats: " + resizeStack.getStats());
        System.out.println("Third stack stats: " + floatStack.getStats());

        // Prints global statistics using getGlobalStats()
        System.out.println("Global stats: " + ArrayStack.getGlobalStats());
    }
}
