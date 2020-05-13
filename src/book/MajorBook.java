package book;

import java.util.Scanner;

import exception.AutherFormatException;

public class MajorBook extends SubBook {

	protected String co_Authers;
	
	public MajorBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBookNumber(input);
		setBookName(input);
		setBookAutherwithYN(input);
		setCoAutherwithYN(input);
		setBookPublisher(input);
	}
	
	public void setCoAutherwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Are ther any co-authers? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer =='y' || answer =='Y') {
					setBookAuther(input);
					break;
				}
				else if (answer =='n' || answer =='N') {
					this.setAuther("");
					break;
				}
				else {
				}
			} catch(AutherFormatException e) {
				System.out.println("Incorrect Auther Format. Put the Auther without mark character");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind = " + skind + " number = " + number + " name = " + name + " auther = " + auther + " co-authers = " + auther + " publisher = " + publisher);
	}
}
