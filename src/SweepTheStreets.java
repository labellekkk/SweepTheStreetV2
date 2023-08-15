import stanford.karel.Karel;

public class SweepTheStreets extends Karel {

    public void run(){

        sweepAllStreets();

    }

    void  sweepAllStreets(){
        sweepAStreet();
        while (leftIsClear()){
            getReadyForNextStreet();
            sweepAStreet();
            if(rightIsClear()){
                getReadyForNextStreet();
                sweepAStreet();
            }else {
                turnAround();
            }
        }

    }
    void sweepAStreet(){
        while(frontIsClear()){
            if(beepersPresent()){
                pickBeeper();
            }
            move();
        }
        if(beepersPresent()){
            pickBeeper();
        }

    }
    void  getReadyForNextStreet(){
         if (facingEast()){
             turnLeft();
             move();
             turnLeft();
         }else {
             turnRight();
             move();
             turnRight();
         }


    }
    void turnAround(){
        turnLeft();
        turnLeft();
    }
    void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

}