class ProgramPenjumlahanJava {
    public static void main(String args[]) {
	// Semua Sourcecode di Eksekusi disini
	
	// Deklarasi Varibale / Konstanta & Tipedata
	// Variable dia memiliki sifat bisa berubah / dapat berubah sesuai dengan keigninan user (dinamis)
	// Konstanta dia memiliki nilai baku / pasti (statis) Contoh: Nilai Pi: 3, 14 
	// Tipe Data adalah sebuah sifat yang bisa disandarkan kepada Variable atau Konstanta 
	// Contoh: Variable  -> Nama Lengkap = "Muhammad Khaerul" String
	//                   -> Umur         = 25 Integer
	//                   -> Berat Badan  = 45, 5 Double atau Float
	//		     -> Golongan Darah = "O" Char
	// Contoh: Konstanta -> Pi = 3,14 Double atau Float
	//                   -> Nama Aplikasi = "Aplikasi Kalkulator" String

	// Tipe Data [spasi] Variabel / Konstanta = Nilai
	// 2 Cara Penulisan Deklarasi
	int nilai_a = 10;
	int nilai_b = 30;
	int nilai_hasil;
	// int nilai_a = 10, nilai_b = 10;
	
	// Inisialiasi
	// Rumus Penjumlahan
	nilai_hasil = nilai_a + nilai_b;
	
	// Implementasi     
	System.out.println("Penjumlahan " + nilai_a + " + " + nilai_b + " adalah " + nilai_hasil);
    }
}
