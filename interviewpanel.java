package queueinterv;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class interviewpanel {
		 private static Queue<String> nameQueue = new LinkedList<>();

		    public static void main(String[] args) {
		    	
		        for (int i = 1; i <= 5; i++) {
		        	System.out.println("Add interviewer name: ");		    		
		    		Scanner sc=new Scanner(System.in);
		    		String name=sc.nextLine();
		    		 nameQueue.add(name);
				      
				        displayQueue();
				        now();
				     
		            try {
		                Thread.sleep(10000); 
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		    }
		    private static void displayQueue() {
		        System.out.println("Interviewer List: " + nameQueue);
		    }
		    public static void now() {
		    	if (!nameQueue.isEmpty()) {
		    		System.out.println("Now Interviewer name: "+nameQueue.peek());
		    	}
		    }
}



