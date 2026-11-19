// an activity

import java.util.Scanner;

public class ComLabReservationSystem{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int id = 0;
		String name = "";
		String reservationDate = "";
		String startTime = "";
		String endTime = "";
		String status = "";
		char stop = 'N';
		char teacherApproval = 'A';
		char laboratoryViolations = 'A';
		char timeSlotAvailability = 'A';
		
		System.out.println("======================================");
		System.out.println("Computer Laboratory Reservation System");
		System.out.println("======================================");
		System.out.println("Continue? (Y/N): ");
		char enter = input.next().charAt(0);

		while (stop != 'Y' && enter == 'Y') {
			while (enter != 'Y' && enter != 'N') {
				System.out.println("Invalid input.");
				System.out.println("Continue? (Y/N): ");
				input.nextLine();
				enter = input.next().charAt(0);
			}
			input.nextLine();
			System.out.println("Enter Student Name: ");
			name = input.nextLine();
			System.out.println("Enter Student ID (5 digits): ");
			id = input.nextInt();
			
			while (id > 99999 || id < 10000) {
			    System.out.println("Invalid ID. Try again.");
			    id = input.nextInt();
			}
			
			System.out.println("Enter Class/Organization: ");
			String organization = input.nextLine();
			input.nextLine();
			System.out.println("Enter Purpose: ");
			String purpose = input.nextLine();
			System.out.println("Enter Reservation Date: ");
			reservationDate = input.nextLine();
			System.out.println("[MAXIMUM 3 HOURS] Enter Duration (hours): ");
			int duration = input.nextInt();
			
			while (duration > 3 || duration < 1) {
				System.out.println("Maximum is 3 hours. Try again.");
				duration = input.nextInt();
			}
			input.nextLine();
			
			System.out.println("Enter Start Time: ");
			startTime = input.nextLine();
			System.out.println("Enter End Time: ");
			endTime = input.nextLine();	
			System.out.println("Teacher Approval Granted? (Y/N): ");
			teacherApproval = input.next().charAt(0);
			System.out.println("Any Unresolved Laboratory Violations? (Y/N): ");
			laboratoryViolations = input.next().charAt(0);
			System.out.println("Is the Requested Time Slot Available?: ");
			timeSlotAvailability = input.next().charAt(0);

			if (teacherApproval == 'Y' && laboratoryViolations == 'N' && timeSlotAvailability == 'Y') {
				status = "APPROVED";
			} else {
				status = "NOT APPROVED";
			}
			
			System.out.println("Student Name: " + name);
			System.out.println("Reservation Date: " + reservationDate);
			System.out.println("Schedule: " + startTime + " - " + endTime);
			System.out.println("Reservation Status: " + status);
			
			if (status != "APPROVED") {
				System.out.println("Your submission does not meet the requirements so your application has been denied.");
			}
			
			if (teacherApproval != 'Y') {
				System.out.println("- No teacher approval.");
			}
			if (laboratoryViolations != 'N') {
				System.out.println("- Unresolved laboratory violations.");
			}
			if (timeSlotAvailability != 'Y') {
				System.out.println("- Time slot unavailable.");
			}
			
			System.out.println("End? (Y/N): ");
			input.nextLine();
			stop = input.next().charAt(0);
			
			while (stop != 'Y' && stop != 'N') {
				System.out.println("Invalid input.");
				System.out.println("End? (Y/N): ");
				input.nextLine();
				stop = input.next().charAt(0);
			}
		}
	}
}
