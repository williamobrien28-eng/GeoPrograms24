public class A1_HowToMove extends World {
    int redColor;
    int greenColor;
    int blueColor;
    public void go()  {

        System.out.println("This message will be printed to the window below.");
        plane.pausetime = 0;
        plane.teleport(500,500);
        width= plane.random(5,20);
        redColor = plane.random(1,255);
        greenColor = plane.random(1,255);
        blueColor = plane.random(1,255);




   sqr(100);
   sqr(55);

   plane.isTrail = false;
    plane.teleport(500,300);
   plane.isTrail = true;
    triangle(plane.random(55,155));
    triangle(plane.random(155,300));

    }
    //this is a method to make a square
    public void sqr(int size) {

        plane.startingAngle(0);
        plane.trailWidth = width;
        plane.isTrail = true;
        plane.setColor(redColor,greenColor,blueColor);
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
    //makes a triangle
    public void triangle(int size){
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.trailWidth = width;
        plane.setColor(redColor,greenColor,blueColor);
        plane.move(size);
        plane.turn(130);
        plane.move(size);
        plane.turn(100);
        plane.move(size);
        plane.turn(130);
        plane.move(size);


    }
    //a parameter is a varibale that exists inside the parenthesis and is used in methods




}

