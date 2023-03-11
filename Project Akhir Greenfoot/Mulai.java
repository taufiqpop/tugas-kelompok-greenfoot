import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

//Subclass Actor Ini Digunakan Untuk Mengatur Icon Mulai, Agar Dapat Di Klik dengan Mouse dan Langsung Memunculkan Beranda
//Gameplay Saat Setelah Meng-klik Icon Tersebut
public class Mulai extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Background());
        }
    }    
}
