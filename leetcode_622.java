public class leetcode_622 {

    int queue[];
    int front;
    int rear;
    int n;
    leetcode_622(int k) {
        n = k;
        queue = new int[n];
        front = rear = -1;
    }

    public boolean enQueue(int value) {
        if((rear + 1) % n == front) return false;
        if(rear == -1) {
            front++;
            rear++;
        }
        else {
            rear = (rear + 1) % n;
        }
        queue[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if(front == -1) return false;
        if(front == rear) {
            front = rear = -1;
        }
        else {
            front = (front + 1) % n;
        }
        return true;
    }

    public int Front() {
        if(front == -1) return -1;
        return queue[front];
    }

    public int Rear() {
        if(rear == -1) return -1;
        return queue[rear];

    }

    public boolean isEmpty() {
        if(front == -1) return true;
        return false;
    }

    public boolean isFull() {
        return (rear + 1) % n == front;
    }
}
