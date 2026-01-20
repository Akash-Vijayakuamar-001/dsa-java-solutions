public class QueueUsingArray {

    static class Queue {
        private int[] arr;
        private int front, rear, size, capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = value;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[front];
            front++;
            size--;
            return val;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20
    }
}
