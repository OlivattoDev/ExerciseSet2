package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		Set<Integer> students = new HashSet<>();

		System.out.print("How many students for course A? ");
		int courseA = sc.nextInt();
		for(int i=0; i < courseA; i++) {
			int studentCode = sc.nextInt();
			students.add(studentCode);
		}
		
		System.out.print("How many students for course B? ");
		int courseB = sc.nextInt();
		for(int i=0; i < courseB; i++) {
			int studentCode = sc.nextInt();
			students.add(studentCode);
		}
		
		System.out.print("How many students for course C? ");
		int courseC = sc.nextInt();
		for(int i=0; i < courseC; i++) {
			int studentCode = sc.nextInt();
			students.add(studentCode);
		}

		System.out.println("Total Students: " + students.size());
		System.out.println("Students Number: "  + students);
		
		sc.close();
	}
}