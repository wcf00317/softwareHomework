package group;
public class Cube {
    private double ax;
    private double bx;
    private double by;
    private double cx;
    private double cy;
    private double cz;
    private String type; //type=1代表平行六面体，type=2代表长方体，type=3代表正方体

    public Cube(String type, double ax, double bx, double by,
                double cx, double cy, double cz) {
        this.type = type;
        this.ax = ax;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.cz = cz;

    }

    public double getVolume() {
        return Math.abs(ax * by * cz);
    }

}
