public class CircularQueue {

    static class CircularQ {
        private int[] arr;
        private int front, rear, size, capacity;

        CircularQ(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.front = 0;
            this.rear = 0;
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
                System.out.println("Circular Queue is full");
                return;
            }

            arr[rear] = value;
            rear = (rear + 1) % capacity;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Circular Queue is empty");
                return -1;
            }

            int val = arr[front];
            front = (front + 1) % capacity;
            size--;
            return val;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQ cq = new CircularQ(3);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);

        System.out.println(cq.dequeue()); // 1
        cq.enqueue(4);

        System.out.println(cq.peek());    // 2
    }
}
