public abstract class GeometricFigure {
    
    private double xPositon;
    private double yPositon;
    private double zPositon;

    public GeometricFigure(double xPositon, double yPositon, double zPositon) {
        this.xPositon = xPositon;
        this.yPositon = yPositon;
        this.zPositon = zPositon;
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

    public abstract double calculateVolume();
    
    public abstract double calculateSurfaceSquare();

}