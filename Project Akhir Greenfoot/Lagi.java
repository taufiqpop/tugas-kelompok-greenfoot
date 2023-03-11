import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

//Subclass Actor Ini Digunakan Untuk Mengatur Icon Lagi, Agar Dapat Di Klik dengan Mouse dan Mengembalikan Ke Beranda
//Gameplay Saat Setelah Meng-klik Icon Tersebut
public class Lagi extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Background());
        }
    }   
}
