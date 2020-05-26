package book;

import java.util.Scanner;

import exception.AutherFormatException;

public abstract class SubBook extends Book {

	public SubBook(BookKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind = " + skind + " number = " + number + " name = " + name + " auther = " + auther + " publisher = " + publisher);
	}
	
	public void setBookAutherwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Is there any specific auther? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer =='y' || answer =='Y') {
					System.out.print("Book author : ");
					String auther = input.next();
					this.setAuther(auther);
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

}
