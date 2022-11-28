/*Karena Qian
 * CS 210
 * 4/13/2020*/
/*This program will draw two down-facing rockets 
 * next to each other.*/
public class DownRockets {
	//This method draws two Vs next to each other
	public static void drawVs() {
		//creates Vs by stacking vars. of "\\/ \\/"
		System.out.println(" \\    /   \\    /");	
		System.out.println("  \\  /     \\  / ");	
		System.out.println("   \\/       \\/  ");	
	}
	//This method draws two boxes next to each other
	public static void drawBoxes() {
		//creates boxes by arranging +, -, and |
		System.out.println("+------+ +------+");	
		System.out.println("|      | |      |");	
		System.out.println("|      | |      |");	
		System.out.println("+------+ +------+");	
	}
	//This method creates the "show" quotes section
	//in the middle
	public static void showQuotes() {
		//Uses |, \", and chars. to create section
		System.out.println("|\"show\"| |\"show\"|");	
		System.out.println("|quotes| |quotes|");	
	}
	//The main method, where everything is executed
	public static void main(String[] args) {
		//First draws the exhaust 
		drawVs();	
		//then the body
		drawBoxes();	 
		//with the text
		showQuotes();	
		drawBoxes();	
		//then the tip
		drawVs();	
	}//The End

}
