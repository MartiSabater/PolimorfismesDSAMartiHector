public class Circle extends Figura {
    double r;

    public Circle(double r){
        this.r = r;
    }


    @Override
    public double area() {
        return Math.PI* r * r;
    }
}
