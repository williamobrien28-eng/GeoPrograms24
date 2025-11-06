public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;
    public int dinosaur;

    public void go() {
        plane.loadBackGround("ab67616100005174877d4c061d08c040974224be.jpeg");
        //plane.showBackGround();

        for (int y = 1; y < 560; y = y + 1) {
            for (int x = 1; x < 1000; x = x + 1) {
              // plane.teleport(x,y);
                plane.pausetime=0;
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
               plane.teleport(x, y);
                plane.setPixelColor(y/3,0,blue/5);
                plane.teleport(x, y);
               // if(red >230 && red<250 && green >165 && green <202 && blue >63 && blue < 90) {


             // plane.setPixelColor(255, 0, 0);

                }  //else {
            //plane.setPixelColor(0,blue/5,y/4);
                //plane.teleport(100, y/5);
                //plane.setPixelColor(y/3,red/5,200);
                //plane.teleport(x/5, y/5);
                //plane.setPixelColor(red/5,green,blue);




            }
        }
     //plane.pausetime=0;
       // plane.setPixelColor(250,0,250);
      // plane.teleport(500,400);
    // dinosaur = plane.random(0,2);
      // = assignment we are giving a value to a variable  ex: int c = 0
      // == question aka does the values of the variables match ex: if (x==2){}
      //if(dinosaur ==0) {
         //plane.house(100);
       }//else{
         // plane.circle(150);
    //  }


    //   }
    //}
//}





