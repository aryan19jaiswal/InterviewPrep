//LEETCODE-225

public class ImplementStackUsingQueues {
    // Primary queue that maintains elements in LIFO order (stack behavior)
    private Deque<Integer> primaryQueue = new ArrayDeque<>();
    // Auxiliary queue used temporarily during push operations
    private Deque<Integer> auxiliaryQueue = new ArrayDeque<>();

    /**
     * Initialize the stack using two queues
     */
    public MyStack() {
    }

    /**
     * Push element x onto stack
     * Time Complexity: O(n) where n is the number of elements in the stack
     *
     * @param x the element to be pushed
     */
    public void push(int x) {
        // Add the new element to the auxiliary queue
        auxiliaryQueue.offer(x);

        // Move all elements from primary queue to auxiliary queue
        // This ensures the new element is at the front after swapping
        while (!primaryQueue.isEmpty()) {
            auxiliaryQueue.offer(primaryQueue.poll());
        }

        // Swap the references of the two queues
        // After swap, primary queue has elements in LIFO order
        Deque<Integer> temp = primaryQueue;
        primaryQueue = auxiliaryQueue;
        auxiliaryQueue = temp;
    }

    /**
     * Remove and return the element on top of the stack
     * Time Complexity: O(1)
     *
     * @return the top element of the stack
     */
    public int pop() {
        return primaryQueue.poll();
    }

    /**
     * Get the top element without removing it
     * Time Complexity: O(1)
     *
     * @return the top element of the stack
     */
    public int top() {
        return primaryQueue.peek();
    }

    /**
     * Check whether the stack is empty
     * Time Complexity: O(1)
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean empty() {
        return primaryQueue.isEmpty();
    }
}
