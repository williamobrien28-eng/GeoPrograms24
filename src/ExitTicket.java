public class ExitTicket extends World{
//todo: method make a called go (dont forget {and)
//todo: in the go method make a variable of type integer called distance. give it a random value between 1 and 100
// todo write a for loop that runs for times

int distance;
    public void go() {
        plane.pausetime=0;
        plane.isTrail = true;
        for (int x = 0; x < 4; x = x + 1) {
            distance = plane.random(1, 100);
            plane.move(distance);
            plane.turn(90);


        }
    }









}
