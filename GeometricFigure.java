public abstract class GeometricFigure {
    
    private double xCenter;
    private double yCenter;
    private double zCenter;

    public GeometricFigure(double xCenter, double yCenter, double zCenter) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.zCenter = zCenter;
    }

    public abstract double calculateVolume();
    public abstract double calculateSurfaceSquare();

}