package MultiThreading.Challenge.Example102;

import java.time.Duration;

public enum TrafficColor {

    RED(2000),
    YELLOW(4000),
    GREEN(8000);

    private int onTimeIn;


    TrafficColor(int onTimeIn) {
        this.onTimeIn = onTimeIn;
    }

    public int getOnTimeIn() {
        return onTimeIn;
    }

   
    

}
