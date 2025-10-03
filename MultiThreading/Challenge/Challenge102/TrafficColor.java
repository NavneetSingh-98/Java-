package MultiThreading.Challenge.Challenge102;

public enum TrafficColor {

    RED(10000),
    GREEN(5000),
    YELLOW(4000);

    private int onTiimeInMillis;

    public int getOnTiimeInMillis() {
        return onTiimeInMillis;
    }



    private TrafficColor(int onTiimeInMillis) {
        this.onTiimeInMillis = onTiimeInMillis;
    }

    

}
