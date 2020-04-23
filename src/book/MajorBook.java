package book;

import java.util.Scanner;

public class MajorBook extends Book {
	
	protected String co_Authers;

	
	public void getUserInput(Scanner input) {
		System.out.print("Book number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
				
		char answer = 'x';
		while (answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Is there any specific auther? (Y/N) ");
			answer = input.next().charAt(0);
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
		}
		answer = 'x';
		while (answer !='y' && answer !='Y' && answer !='n' && answer !='N') {
			System.out.print("Are ther any co-authers? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer =='y' || answer =='Y') {
				System.out.print("Co-authors : ");
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
		}
		
		System.out.print("Book publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Nonfiction:
			skind = "Nonfiction";
			break;
		case Magazine:
			skind = "Magazine";
			break;
		case Major:
			skind = "Major";
			break;
		default:
		}
		System.out.println("kind = " + skind + " number = " + number + " name = " + name + " auther = " + auther + " co-authers = " + auther + " publisher = " + publisher);
	}

}
