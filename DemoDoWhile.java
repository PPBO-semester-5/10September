public class DemoDoWhile {
	/**Main Method*/
	public static void main(String[] args) {
		int counter = 0; //Inisialisasi counter

		System.out.println("\nPROGRAM DEMO DO..WHILE");
		System.out.println("----------------------\n");

		do { //Kondisi perulangan
			System.out.println("Mencetak counter ke-" + counter );
			++counter; //Menaikkan counter dengan 1
		}

		while(counter <= 0 );
	}
}