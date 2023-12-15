package queueinter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class interviewlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> name = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choose;
		do {
			System.out.println("\nEnter the choice:");
			System.out.println("1.Add candidate mark person1 \n2.Add candidate mark person2\n 3.Add candidate mark person3\n 4.Add candidate mark person4 \n5.Add candidate mark person5\n 0.exit");			
			 choose = sc.nextInt();
			switch (choose) {
			case 1:
				ArrayList<Integer> mark1 = new ArrayList<>();
				System.out.println("Enter the mark");
				mark1.add(sc.nextInt());
				mark1.add(sc.nextInt());
				System.out.println(mark1);
			case 2:
				ArrayList<Integer> mark2 = new ArrayList<>();
				System.out.println("Enter the mark");
				mark2.add(sc.nextInt());
				mark2.add(sc.nextInt());
			case 3:
				ArrayList<Integer> mark3 = new ArrayList<>();
				System.out.println("Enter the mark");
				mark3.add(sc.nextInt());
				mark3.add(sc.nextInt());
			case 4:
				ArrayList<Integer> mark4 = new ArrayList<>();
				System.out.println("Enter the mark");
				mark4.add(sc.nextInt());
				mark4.add(sc.nextInt());
			case 5:
				ArrayList<Integer> mark5 = new ArrayList<>();
				System.out.println("Enter the mark");
				mark5.add(sc.nextInt());
				mark5.add(sc.nextInt());
			
	default:
		System.out.println("Invalid input");
		break;
	} 
		}
	while (choose!=0);
System.out.println();
	
	}
}
