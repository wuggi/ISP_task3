import java.util.Scanner;

public class Spritrechner {
	
	public static float calc(){
		
		int km;
		float verbrauch;
		float spritpreis;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Zu fahrende Kilometer: ");
		km = scan.nextInt();
		
		System.out.println("Verbrauch: ");
		verbrauch = scan.nextFloat();
		
		System.out.println("Spritpreis: ");
		spritpreis = scan.nextFloat();
		
		float result = km * verbrauch/100 * spritpreis;
		scan.close();
		return result;
	}
	
	public Spritrechner(){
		System.out.println("=========================== SpritRechner ===========================");
		System.out.println("Kosten: "+calc());
	}

}
