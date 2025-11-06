public class GradedPicture extends World {
    int red;
    int blue;
    int green;
    int randomvalue;

    public void go() {
        plane.teleport(0, 0);
        plane.isTrail = true;
        plane.setColor(0, 0, 0);
        plane.trailWidth = 10000;
        plane.move(100);
        green = plane.random(176, 180);
        red = plane.random(192, 196);
        blue = plane.random(126, 130);
        plane.pausetime = 0;

        water();
        beach();
        plane.teleport(200, 250);
        //mountain();
        plane.teleport(900, 385);

        //makes the houses in order
        for (int x = 0; x < 6; x++) {
            plane.teleport(100 + x * 150, 490);
            house();

        }

        plane.teleport(849, 134);
        moon();
        snow();
        snows();



    }

    //this makes a square
    public void sqr(int size) {

        plane.startingAngle(0);
        plane.trailWidth = 5;
        plane.isTrail = true;
        plane.setColor(173, 216, 230);
        plane.move(size);
        plane.isTrail = true;
        plane.turn(90);
        plane.isTrail = true;
        plane.move(size);
        plane.isTrail = true;
        plane.turn(90);
        plane.isTrail = true;
        plane.move(size);
        plane.isTrail = true;
        plane.turn(90);
        plane.move(size);
    }

    //makes the mountains
    public void mountain() {
        plane.setColor(128, 128, 128);
        plane.trailWidth = 10;
        plane.startingAngle(265);
        plane.move(100);
        plane.turn(90);
        plane.move(15);
        plane.turn(90);
        plane.move(15);
        plane.turn(180);
        plane.move(50);
        plane.turn(180);
        plane.move(50);
        plane.turn(180);
        plane.move(100);
        plane.turn(90);
        plane.move(25);
        plane.turn(270);
        plane.move(50);
        plane.turn(150);
        plane.move(180);
        plane.turn(270);
        plane.move(15);
        plane.turn(90);
        plane.move(80);
        plane.turn(115);
        plane.move(185);
        plane.turn(90);


    }

    //makes a triangle
    public void triangle(int size) {
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.trailWidth = 10;
        plane.setColor(100, 100, 100);
        plane.move(size);
        plane.turn(130);
        plane.move(size);
        plane.turn(100);
        plane.move(size);
        plane.turn(130);
        plane.move(size);
    }

    // makes a house
    public void house() {
        plane.startingAngle(0);
        plane.trailWidth = 10;
        plane.isTrail = true;
        plane.setColor(150, 111, 51);
        plane.move(100);
        plane.isTrail = true;
        plane.turn(90);
        plane.isTrail = true;
        plane.move(100);
        plane.isTrail = true;
        plane.turn(90);
        plane.isTrail = true;
        plane.move(100);
        plane.isTrail = true;
        plane.turn(90);
        plane.move(100);
        plane.isTrail = false;
        plane.turn(180);
        plane.move(100);
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.trailWidth = 10;
        plane.setColor(100, 100, 100);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.isTrail = false;
        plane.trailWidth = 2;
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(20);
        plane.isTrail = true;
        sqr(10);
        plane.isTrail = false;
        plane.turn(270);
        plane.move(60);
        plane.isTrail = true;
        sqr(10);
        plane.isTrail = false;
        plane.move(45);
        plane.turn(90);
        plane.move(25);
        plane.turn(90);
        plane.isTrail = true;
        plane.setColor(96, 80, 71);
        plane.move(22);
        plane.turn(270);
        plane.move(11);
        plane.turn(270);
        plane.move(22);
    }


    //makes the sand
    public void beach() {
        plane.startingAngle(0);
        plane.teleport(-10, 500);
        plane.trailWidth = 100;
        plane.setColor(red, green, blue);
        plane.move(1000);
        plane.teleport(-10, 500);
        plane.trailWidth = 10;
        plane.setColor(255, 255, 255);
        plane.move(1100);
        //makes the rocks
        for (int x = 0; x < 50; x++) {
            randomvalue = plane.random(0, 10);
            if (randomvalue < 3) {
                plane.isTrail = true;
                plane.trailWidth = 10;
                plane.setColor(100, 100, 100);
                plane.teleport(plane.random(0, 1000), plane.random(520, 590));
                plane.move(20);
                plane.setColor(255,255,255);
                plane.trailWidth=2;
                plane.turn(180);
                plane.move(20);

            }
        }

    }


    //makes the ocean
    public void water() {
        plane.startingAngle(0);
        plane.teleport(-10, 600);
        plane.trailWidth = 500;
        plane.setColor(0, 0, 100);
        plane.move(1000);
        //makes the fish
        for (int x = 0; x < 50; x++) {
            randomvalue = plane.random(0, 10);
            if (randomvalue < 3) {
                plane.isTrail = true;
                plane.trailWidth = 10;
                plane.setColor(255, 165, 0);
                plane.teleport(plane.random(0, 1000), plane.random(650, 800));
                plane.move(25);
                plane.trailWidth = 5;
                plane.setColor(0, 0, 0);
                plane.move(7);
                plane.setColor(255, 255, 255);
                plane.move(3);
                plane.trailWidth = 7;
                plane.isTrail = false;
                plane.turn(180);
                plane.move(20);
                plane.isTrail = true;
                plane.setColor(255, 165, 0);
                plane.turn(90);
                plane.move(5);
                plane.turn(180);
                plane.move(10);


            }

        }
    }

    //makes the moon
    //todo fill the moon
    public void moon() {

        plane.setColor(250, 250, 250);
        plane.trailWidth = 10;
        plane.pausetime = 0;
        //todo make a loop where the radius goes down by one to fill the whole circle
        //makse a gradient and fills in the moon
        for (int r = 100; r > 0; r--) {
            plane.setColor(r * 2, r * 2, r * 2);
            plane.circle(r + 10);
        }


    }

    public void snow() {
        //makes snow go on top of screen
        for (int y = 50; y <= 230; y += 50)
            for (int x = 50; x <= 3750; x += 50) {
                plane.teleport(plane.random(0, 775), plane.random(0, 315));

                plane.setColor(255, 255, 255);
                plane.isTrail = true;
                plane.trailWidth = 2;
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);


            }
    }

    public void snows() {
        //makes snow go on top of screen
        for (int y = 50; y <= 230; y += 50)
            for (int x = 50; x <= 500; x += 50) {
                plane.teleport(plane.random(0, 93), plane.random(0, 495));

                plane.setColor(255, 255, 255);
                plane.isTrail = true;
                plane.trailWidth = 2;
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);
                plane.turn(60);
                plane.move(4);
                plane.turn(45);
                plane.move(1);
                plane.move(-1);
                plane.turn(-90);
                plane.move(1);
                plane.move(-1);
                plane.turn(45);
                plane.move(-4);


            }

    }
}





