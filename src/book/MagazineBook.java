package book;

import java.util.Scanner;

public class MagazineBook extends Book {
	
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
		
		System.out.print("Book publisher : ");
		String publisher = input.next();
		this.setPublisher(publisher);
	}


}

