package book;

import java.util.Scanner;


public class MagazineBook extends SubBook {
	
	public MagazineBook(BookKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setBookNumber(input);
		setBookName(input);
		setBookAutherwithYN(input);
		setBookPublisher(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind = " + skind + " number = " + number + " name = " + name + " auther = " + auther + " publisher = " + publisher);
	}


}

