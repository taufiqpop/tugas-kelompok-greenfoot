import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

//Subclass Actor Ini Digunakan Untuk Mengatur Icon Keluar, Agar Dapat Di Klik dengan Mouse & Mengembalikan Ke Beranda Awal 
//Saat Setelah Meng-klik Icon Tersebut
public class Keluar extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MenuAwal());
            Greenfoot.stop();
        }
    }    
}
