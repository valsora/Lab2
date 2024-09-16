public abstract class GeometricFigure {
    
    private double xCenter;
    private double yCenter;
    private double zCenter;

    public GeometricFigure(double xCenter, double yCenter, double zCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.zCenter = zCenter;
    }

    public double getXCenter() {
        return xCenter;
    }

    public void setXCenter(double xCenter) {
        this.xCenter = xCenter;
    }

    public double getYCenter() {
        return yCenter;
    }

    public void setYCenter(double yCenter) {
        this.yCenter = yCenter;
    }

    public double getZCenter() {
        return zCenter;
    }

    public void setZCenter(double zCenter) {
        this.zCenter = zCenter;
    }

    public abstract double calculateVolume();
    
    public abstract double calculateSurfaceSquare();

}