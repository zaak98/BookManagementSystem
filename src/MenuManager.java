import java.util.Scanner;

public class MenuManager {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookmanager = new BookManager(input);
		
		int num = -1;
		while (num != 5) {
			System.out.println ("***Book Management System Menu***");
			System.out.println ("1. Add Book");
			System.out.println ("2. Delete Book");
			System.out.println ("3. Edit Book");
			System.out.println ("4. View Book");
			System.out.println ("5. Exit");
			System.out.println ("Select one number between 1 - 5 :");
			num = input.nextInt();
			if (num == 1) {
				bookmanager.addBook();
			}
			if (num == 2) {
				bookmanager.deleteBook();
			}
			if (num == 3) {
				bookmanager.editBook();
			}
			if (num == 4) {
				bookmanager.viewBooks();
			}
			else {
				continue;
			}
		}
	}
	
}
