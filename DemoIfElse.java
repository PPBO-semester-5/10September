import java.util.Scanner;

class DemoIfElse {
	/**Main Method*/
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double nilaiInput;

		System.out.println("\nPROGRAM DEMO IF ELSE");
		System.out.println("--------------------\n");

		/*
		Menginstrusikan user untuk menginputkan nilai.
		Untuk memasukkan data dari keyboard, digunakan
		kelas bantuan InputConsole.java. Pembahasan yang
		mendalam tenatng ini dapat anda baca di bab 14.
		*/

		System.out.println("Masukkan Nilai [0 - 100]: ");
		nilaiInput = input.nextInt();

		//Menyeleksi range 0 - 100
		if ((nilaiInput < 0) | (nilaiInput > 100)) {
			System.out.println("Data input invalid :");
		}

		//Kalau input valid, lakukan instruksi berikut
		else {
			//Menyeleksi kondisi
			if (nilaiInput >= 60){
				System.out.println("\nSelamat anda lulus mata " + "kuliah ini.");
				if (nilaiInput >= 85)
					System.out.println("\nNilai anda: A");
				else if (nilaiInput >= 70)
					System.out.println("\nNilai anda: B");
				else if (nilaiInput >= 60)
					System.out.println("\nNilai anda: C");
			}

			else {
				System.out.println("\nMaaf anda harus mengulang " + 
						"mata kuliah ini kembali, atau " + 
						"mengikuti ujian perbaikan dengan " + 
						"nilai maksimum C");
			}
		}
	}
}