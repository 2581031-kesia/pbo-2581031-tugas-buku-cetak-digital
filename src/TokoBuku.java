public class TokoBuku {
    public static void main(String[] args) {
        // Percobaan (ketentuan no. 8): baris super(...) di constructor BukuDigital
        // dihapus sementara. Pesan error yang muncul:

        // java: constructor Buku in class Buku cannot be applied to given types;
        //  required: java.lang.String,java.lang.String,int
        //  found:    no arguments
        //  reason: actual and formal argument lists differ in length

        // Penyebab: jika subclass tidak memanggil super(...) secara eksplisit, Java
        // otomatis menyisipkan super() tanpa argumen, padahal Buku tidak punya
        // constructor tanpa parameter. Baris super(...) sudah dikembalikan.

        Buku[] keranjang = {
                new BukuCetak("Pemrograman Java", "John Doe", 120000, 750),
                new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400),
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        };

        System.out.println("=============== KERANJANG ===============");
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            total += b.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total bayar   : " + Buku.formatRupiah(total));
    }
}