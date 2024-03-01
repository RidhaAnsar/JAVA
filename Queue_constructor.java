import java.io.*;
public class Queue_constructor
{
	private int maxSize;
	private int[] queueArray;
	private int front;
	private int rear;
	private int currentSize;

	// Constructor to initialize the queue
	public Queue(int size) 
	{
	maxSize = size;
	queueArray = new int[maxSize];
	front = 0;
	rear = -1;
	currentSize = 0;
	}

	// Method to insert an element into the queue
	public void enqueue(int value) 
	{
	if (currentSize == maxSize) 
	{
		System.out.println("Queue is full. Cannot enqueue.");
		return;
	}

// Increment rear and add the element
rear = (rear + 1) % maxSize;
queueArray[rear] = value;
currentSize++;
System.out.println(value + " enqueued to the queue");
}

// Method to remove an element from the queue
public void dequeue() 
{
	if (currentSize == 0) 
	{
		System.out.println("Queue is empty. Cannot dequeue.");
		return;
	}
	// Remove element at the front
	int removedValue = queueArray[front];
	front = (front + 1) % maxSize;
	currentSize--;
	System.out.println(removedValue + " dequeued from the queue");
}

// Method to get the front element without removing it
public int front() 
{
	if (currentSize == 0) 
	{
		System.out.println("Queue is empty. No front element.");
		return -1; // You may choose a different value to indicate an error
	}
	return queueArray[front];
}

// Method to check if the queue is empty
public boolean isEmpty() 
{
	return currentSize == 0;
}

// Method to check if the queue is full
public boolean isFull() 
{
	return currentSize == maxSize;
}

// Method to get the size of the queue
public int size() 
{
	return currentSize;
}

public static void main(String[] args) 
{
	// Create a queue with a maximum size of 5
	Queue myQueue = new Queue(5);
	// Enqueue elements
	myQueue.enqueue(10);
	myQueue.enqueue(20);
	myQueue.enqueue(30);

	// Dequeue an element
	myQueue.dequeue();

	// Print front element
	System.out.println("Front element: " + myQueue.front());

	// Check if the queue is empty
	System.out.println("Is the queue empty? " + myQueue.isEmpty());

	// Check if the queue is full
	System.out.println("Is the queue full? " + myQueue.isFull());

	// Get the size of the queue
	System.out.println("Queue size: " + myQueue.size());
}
}
