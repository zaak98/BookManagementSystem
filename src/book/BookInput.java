package book;

import java.util.Scanner;

import exception.AutherFormatException;

public interface BookInput {
	
	public void getUserInput(Scanner input);
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setAuther(String auther) throws AutherFormatException;
	
	public void setPublisher(String publisher);
	
	public int getNumber();
	
	public void printInfo();
	
	public void setBookNumber(Scanner input);
	
	public void setBookName(Scanner input);
	
	public void setBookAuther(Scanner input);
	
	public void setBookPublisher(Scanner input);

}
