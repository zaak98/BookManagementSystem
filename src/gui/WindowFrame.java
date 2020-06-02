package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	MenuSelection menuselsction;
	BookAdder bookadder;
	BookViewer bookviewer;

	public WindowFrame() {
		this.menuselsction = new MenuSelection(this);
		this.bookadder = new BookAdder(this);
		this.bookviewer = new BookViewer(this);
		
		this.setSize(500, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(menuselsction);
		
		this.setVisible(true);
	}

	public void setUpPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselsction() {
		return menuselsction;
	}

	public void setMenuselsction(MenuSelection menuselsction) {
		this.menuselsction = menuselsction;
	}

	public BookAdder getBookadder() {
		return bookadder;
	}

	public void setBookadder(BookAdder bookadder) {
		this.bookadder = bookadder;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}


}
