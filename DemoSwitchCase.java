import java.util.Scanner;

public class DemoSwitchCase {
	/**Main Method*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		//Ubahlah nilai ini untuk menguji pilihan yang lain

		System.out.println("\nPROGRAM DEMO SWITCH CASE");
		System.out.println("------------------------\n");

		//Menginstruksikan user untuk memasukkan pilihan
		System.out.println("Masukkan pilihan anda [1-3] : ");
		pilihan = input.nextInt();

		switch (pilihan) {
			case 1:
				System.out.println("\nAnda memilih Tom Cruise.");
				break;
			case 2:
				System.out.println("\nAnda memilih Jacky Chan.");
				break;
			case 3:
				System.out.println("\nAnda memilih Van Damme.");
				break;
			default:
				System.out.println("\nHanya pilian [1-3] yang " + "diperbolehkan.");
		}//akhir switch
	}//akhir main method
}//akhir class SwitchTest