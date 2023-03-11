import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

//Penempatan Fungsi untuk Subclass Background, Ada Perubahan Nama yaitu dari MyWorld menjadi Background
public class Background extends World
{
    //Mendeklarasikan Variable Sebelum The Constructor dan Methods yang Mengarah pada Actor Ladybug.
    //Fungsi Tersebut juga Menampilkan Angka Lives untuk Actor Ladybug pada Subclass Background
    private int livesLadybug = 3;
    
    //Untuk Mengatur Ukuran Panjang, Lebar, dan Cellnya. Dan Juga Menambahkan Objek Class Actor Pada Subclass Background
    public Background()
    {
        super(900, 300, 1);
        setPaintOrder(Ladybug.class, Shamrock.class, Spider.class);
        addObject(new Ladybug(), 200,250);
        addObject(new Shamrock(), 700,30);
        addObject(new Spider(), 500, 30);
    } 
   
    //Untuk Return, Digunakan Sebagai Kembali Semula Actor Ladybug Ketika Menyentuh Actor Spider. Dan untuk updLives,
    //Digunakan untuk Mengurangi Nilai Lives pada Actor Ladybug Sehingga akan Berkurang 1 Ketika Menyentuh Actor Spider
    //Hingga Bernilai 0 atau Game Over
    public int getLivesLadybug()
    {
        return livesLadybug;
    }
    public void updLives()
    {
        livesLadybug-= 1;
    }
    
    //Fungsi Random Number Ini Digunakan Untuk Mengacak/Random Actor Spider dan Shamrock
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            addObject(new Shamrock(), Greenfoot.getRandomNumber(700), 10);
        }
        if(Greenfoot.getRandomNumber(700) < 1)
        {
            addObject(new Spider(), Greenfoot.getRandomNumber(500), 10);
        }
    }
    
}