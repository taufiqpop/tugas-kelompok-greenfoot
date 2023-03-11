import greenfoot.*; //(Berisi Tentang Info World, Actor, GreenfootImage, Greenfoot dan Mouse)

//Ada Penambahan Sebelum The Constructor Yaitu ShamrockEaten dan x maupun y. Untuk ShamrockEaten Digunakan Pemanggilan 
//Fungsi Ketika Actor Ladybug Akan Memakan Actor Shamrock. Sedangkan untuk x dan y adalah Pengaturan Fungsi Letak Random 
//Pada Actor Spider maupun Shamrock juga, Tetapi x dan y Juga Bisa Mengontrol Gerak Mouse pada Ladybug Supaya Mendapatkan
//Shamrocknya. Terdapat if…=null, digunakan untuk Menghilangkan Actor Spider dan Shamrock saat Terkena Ladybug.
//Ada setLoc untuk Angka Lives, yang Nantinya akan Muncul di Sebelah Kiri Pojok Atas. Lalu ada Fungsi if Lagi Setelah if
//untuk Actor Spider, Itu digunakan Ketika Angka Lives Sudah Berkurang dari 1 atau nilai 0 maka akan Muncul GameOver.
public class Ladybug extends Actor{
    private int lives = 3;
    private int ShamrockEaten;
    int x = 5;
    int y = 5;
    public void act(){
        Background myw1 = (Background)getWorld();
        Background myLivesLadybug = (Background)getWorld();
        getWorld().showText("Lives : "+myLivesLadybug.getLivesLadybug(),50,60);
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        } 
        Shamrock a= (Shamrock)getOneIntersectingObject(Shamrock.class);

        if (a!=null){
            ((Background)getWorld()).removeObject(a);
            return;
        }  
        Spider Spider=(Spider)getOneIntersectingObject(Spider.class);
        if(Spider!=null){
            setRotation(0);
            ((Background)getWorld()).removeObject(Spider);
            myw1.updLives();
            setLocation(759,240);
        }
        if(myw1.getLivesLadybug()<1){   
            Greenfoot.setWorld(new GameOver());
        }
    }
}