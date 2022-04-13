package Com.Bridgelabz.Adress;

import java.util.Scanner;

public class AddressBook {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
	AddressBook manager = new AddressBook();
	System.out.println("Welcome to Address");
	do {
	System.out.println("Make a choice from below");
	System.out.println("1. Create\t 2. Open\t 3. Save\t4. Save As\t 5.Quit");
    switch (s.nextInt()) {
	case 1:
	manager.create();
	break;
    case 2:
    manager.open();
	break;
    case 3:
	manager.save();
	break;
	case 4:
	manager.save();
	break;
	case 5:
	manager.quit();
	break;
	}
	}
	while (true);
	}
	private void quit() {
		
	}
	private void save() {
		
	}
	private void open() {
	
	}
	private void create() {
	
	}
}