public abstract class GeometricFigure {
    
    private double xPositon;
    private double yPositon;
    private double zPositon;
    private static int numberOfCreated = 0;

    public GeometricFigure(double xPositon, double yPositon, double zPositon) {
        this.xPositon = xPositon;
        this.yPositon = yPositon;
        this.zPositon = zPositon;
        numberOfCreated += 1;
    }

    public double getXPositon() {
        return xPositon;
    }

    public void setXPositon(double xPositon) {
        this.xPositon = xPositon;
    }

    public double getYPositon() {
        return yPositon;
    }

    public void setYPositon(double yPositon) {
        this.yPositon = yPositon;
    }

    public double getZPositon() {
        return zPositon;
    }

    public void setZPositon(double zPositon) {
        this.zPositon = zPositon;
    }

    public static int getNumberOfCreated() {
        return numberOfCreated;
    }

    public abstract double calculateVolume();
    
    public abstract double calculateSurfaceSquare();

}