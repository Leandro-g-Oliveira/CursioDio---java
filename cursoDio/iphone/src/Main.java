import java.util.Scanner;
import main.java.edu.leandro.iphone.models.impl.*;
import main.java.edu.leandro.iphone.models.device.Iphone;
public class Main {
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		Scanner scan = new Scanner(System.in);
		iphone.menu(scan);
	}
}