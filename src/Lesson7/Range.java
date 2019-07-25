package Lesson7;

public class Range {
    private double from;
    private double to;

    public Range (double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public static double getLength (double from, double to) {
        return to - from;
    }

    /*public static boolean isInside (double userNumber) {
        return (userNumber >= from && userNumber <= to)
    }*/


        boolean isInside;

        double userNumber;

        Range range1 = new Range(1, 100);

        //if (userNumber >= range1 &&
    }




