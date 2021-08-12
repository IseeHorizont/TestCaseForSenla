package Task2;

public class Vector {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void length(){
        System.out.println("Длина вектора: " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public void multiplyWithVector(Vector vector){
        System.out.println("Произведение векторов равно вектору:"
                            + new Vector(x1 * vector.getX1(), y1 * vector.getY1(),
                            x2 * vector.getX2(), y2 * vector.getY2()
        ));
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    @Override
    public String toString() {
        return " начало (" + x1 + ", " + y1 + ")" +
                ", конец (" + x2 + ", " + y2 + ")";
    }
}
