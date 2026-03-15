//NIM : E31252132
//Nama : Geovanny Hugo Arifin
//Gol : C

// Polymorphism adalah konsep di OOP dimana objek dapat mengambil banyak bentuk.
// Di sini, kelas BangunDatar sebagai superclass, dan subkelas seperti Persegi, Lingkaran, Segitiga
// meng-override metode luas() dan keliling() untuk memberikan implementasi spesifik.

// Class induk
class BangunDatar {
    // Metode luas() yang akan di-override oleh subkelas
    public double luas() {
        return 0;
    }
    // Metode keliling() yang akan di-override oleh subkelas
    public double keliling() {
        return 0;
    }
}

//Class anak / turunan
// Class Persegi - mengimplementasikan luas dan keliling persegi
class Persegi extends BangunDatar {
    double sisi;

    // Konstruktor untuk inisialisasi sisi persegi
    Persegi(double sisi) {
        this.sisi = sisi;
    }
    // Override metode luas() untuk persegi: sisi * sisi
    @Override
    public double luas() {
        return sisi * sisi;
    }

    // Override metode keliling() untuk persegi: 4 * sisi
    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

// Class Lingkaran - mengimplementasikan luas dan keliling lingkaran
class Lingkaran extends BangunDatar {
    double r;

    // Konstruktor untuk inisialisasi jari-jari lingkaran
    Lingkaran(double r) {
        this.r = r;
    }

    // Override metode luas() untuk lingkaran: π * r²
    @Override
    public double luas() {
        return Math.PI * r * r;
    }

    // Override metode keliling() untuk lingkaran: 2 * π * r
    @Override
    public double keliling() {
        return 2 * Math.PI * r;
    }
}

// Class Segitiga - mengimplementasikan luas dan keliling segitiga (asumsi segitiga sama sisi)
class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return 3 * alas;
    }
}

// Class utama atau main - mendemonstrasikan penggunaan polymorphism
public class polymorphism {
    public static void main(String[] args) {

        // Membuat objek dengan tipe superclass tapi instance subkelas
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar segitiga = new Segitiga(6, 8);

        // Memanggil metode yang di-override sesuai dengan tipe objek sebenarnya
        System.out.println("Persegi");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());
        System.out.println();

        System.out.println("Lingkaran");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());
        System.out.println();

        System.out.println("Segitiga");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}