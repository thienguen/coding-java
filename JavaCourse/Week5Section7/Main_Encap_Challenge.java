import Encapsulation_Challenge.Printer;

public class Main_Encap_Challenge {
	public static void main(String[] args) {
		Printer printer = new Printer(50, false);
		System.out.println("Initial page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println(
				"Pages printed was " + pagesPrinted + " new total print count for printer = "
						+ printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println(
				"Pages printed was " + pagesPrinted + " new total print count for printer = "
						+ printer.getPagesPrinted());
		System.out.println("Adding 50% to tonerLevel with a new total of " + printer.addToner(50) + "% tonerLevel");
	
	}
}