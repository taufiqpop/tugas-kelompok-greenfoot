import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

public class GameOver extends World //Keterangan SubClass dari GameOver.
{
    //Memanggil Kode Yang Ada Pada SubClass GameOver & Memanggil Fungsi Yang Biasa Digunakan Untuk Keterangan Ukuran
    public GameOver()
    {    
        super(480, 380, 1); //Mengatur Ukuran Template
        prepare(); // Mempersiapkan Jika Ada Pemanggilan Fungsi Lagi Pada SubClass GameOver
    }

    private void prepare() //Untuk Mempersiapkan Icon Yang Akan Di Masukkan Ke MyWorld.
    {
        Keluar keluar = new Keluar(); // Mengatur Icon Saat Di Klik Agar Bisa Keluar (Ke Beranda Awal)
        addObject(keluar,432,318); //Memvisualisasi Icon Objek “Keluar” Pada Koordinat Tersebut
        Lagi lagi = new Lagi(); //Mengatur Icon Saat Di Klik Agar Bisa Kembali Ke Beranda Game Secara Langsung
        addObject(lagi,370,316); // Memvisualisasi Icon Objek “Lagi” Pada Koordinat Tersebut
    }
}







