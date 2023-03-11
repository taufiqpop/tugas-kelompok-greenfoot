import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

public class MenuAwal extends World //Memperluas Subclass MenuAwal Actor Terhadap Fungsi Lainnya
{

    public MenuAwal() //Menampilkan Ukuran Image/Template MenuAwal
    {    
        super(900, 300, 1); //Membuat Subclass Baru Sebesar 900 x 300 dengan Ukuran 1 Pixel
        prepare(); //Menampilkan Object-Object yang Berada di private void prepare
    }

    private void prepare() //Berisi Keterangan Icon-Icon yang akan Ditampilkan
    {
        Mulai mulai = new Mulai(); //Membuat Class Baru dengan Nama Mulai
        addObject(mulai,452,250); //Meletakkan Posisi Icon Mulai
        Keluar keluar = new Keluar(); //Membuat Class Baru dengan Nama Keluar
        addObject(keluar,556,256); //Meletakkan Posisi Ikon Keluar
        Lagi lagi = new Lagi(); //Membuat Class Baru dengan Nama Lagi
        addObject(lagi,353,253); //Meletakkan Posisi Icon Lagi
    }
}
