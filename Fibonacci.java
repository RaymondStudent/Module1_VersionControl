/* Advanced Java Programming
 * Programming Walkthrough #2
 * Author: Raymond Ynoa
 * 
 * Instructions: Write two Java methods. Each will solve for the nth term of the
 * Fibonacci sequence (Links to an external site.). One method should use a recursive
 * algorithm and the other should use an iterative algorithm.
 * */

public class Fibonacci {

	public static int recursion(int n) { // Index n.
		if ((n >= 0) && (n < 2)) { // Base case for 0 and 1, return n.
	       return n;
	    }
	    else { // Solve for the nth term.
	       return recursion(n-1) + recursion(n-2);
	    }
	}
	
	public static int iteration(int n) { // n is the index and max number of iterations.
		int currentNumber = 0; // Current Fibonacci number.
		int nextNumber = 1; // Next Fibonacci number.

	    for (int i = 0; i < n; ++i) {
	          int sum = currentNumber + nextNumber; // Solve for current nth term.
	          currentNumber = nextNumber; // Update current Fibonacci number.
	          nextNumber = sum; // Update next Fibonacci number.
	      }
	    
		return currentNumber; // Final solve for nth term.
	}
	
	public static void main(String[] args) {
		// Variables that will be tested in each algorithm.
		int test1 = 5;
		int test2 = 10;
		int test3 = 15;
		int test4 = 20;
		
		System.out.println("Recursion: " + recursion(test1));
		System.out.println("Recursion: " + recursion(test2));
		System.out.println("Recursion: " + recursion(test3));
		System.out.println("Recursion: " + recursion(test4));
		System.out.println();
		System.out.println("Iteration: " + iteration(test1));
		System.out.println("Iteration: " + iteration(test2));
		System.out.println("Iteration: " + iteration(test3));
		System.out.println("Iteration: " + iteration(test4));
		
		/*Insert test between times.
		long startTime = System.nanoTime();
				
		iteration(test4);
				
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
		System.out.println(runTime);
		*/
	}
}
