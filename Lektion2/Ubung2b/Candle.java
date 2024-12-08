package Lektion2.Ubung2b;

public class Candle {
    private String timestap;
    private double open;
    private double low;
    private double high;
    private double close;
    private int volume;

    public Candle(String timestap, double open, double low, double close, double high, int volume) {
        this.timestap = timestap;
        this.open = open;
        this.low = low;
        this.close = close;
        this.high = high;
        this.volume = volume;
    }
    public String getTimestap() {
        return timestap;
    }

    public void setTimestap(String timestap) {
        this.timestap = timestap;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
