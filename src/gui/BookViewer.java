package gui;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import book.BookInput;
import manager.BookManager;

public class BookViewer extends JPanel{
	
	WindowFrame frame;
	BookManager bookmanager;
	
	public BookViewer(WindowFrame frame, BookManager bookmanager) {
		this.frame = frame;
		this.bookmanager = bookmanager;
		
		//System.out.println("***" + bookmanager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Auther");
		model.addColumn("Publisher");
		
		for(int i=0; i<bookmanager.size(); i++) {
			Vector row = new Vector();
			BookInput bi = bookmanager.get(i);
			row.add(bi.getNumber());
			row.add(bi.getName());
			row.add(bi.getAuther());
			row.add(bi.getPublisher());
			model.addRow(row);
		}

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
} 
