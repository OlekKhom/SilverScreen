package pl.cinema.SilverScreen;

public class Seat {
    private int numberSeat;
    private boolean vip;

    public Seat(int numberSeat, boolean vip) {
        this.numberSeat = numberSeat;
        this.vip = vip;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public Seat setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
        return this;
    }

    public boolean isVip() {
        return vip;
    }

    public Seat setVip(boolean vip) {
        this.vip = vip;
        return this;
    }
}
