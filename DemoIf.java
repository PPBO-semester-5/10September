import java.util.Scanner;

public class DemoIf {
	/**Main Method*/
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double nilaiInput;

		System.out.println("\nPROGRAM DEMO IF");
		System.out.println("---------------\n");

		//Menginstrusikan user utuk menginputkan nilai
		System.out.println("Masukkan Nilai [0 - 100]:");
		nilaiInput = input.nextInt();

		//Menyeleksi kondisi dan mencetak hasil ke console
		if (nilaiInput>= 60)
		System.out.println("\nSelamat, anda lulus mata kuliah ini.");

	}
}