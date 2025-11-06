public class B0_BasicLoop extends World {
int green;
int blue;
int red;
    public void go() {
        plane.pausetime=1;
        plane.isTrail=true;
        plane.trailWidth=2;




        for(int y = 0; y <3; y++) {

            for (int x = 0; x < 5; x = x + 1) {
                System.out.println("x: " + x);
                red = 0;
                blue = 255 - y * 50;
                green = y * 60;
                plane.startingAngle(0);
                plane.setColor(red, green, blue);
                plane.teleport(300+125*x,100+y*120);
                plane.square(100);
                plane.isTrail = false;
                plane.move(100);
                plane.isTrail = true;



            }
        }




        }
}


//todo figure out how to change the value of y which is 250 make it so there are three rows of squares again
