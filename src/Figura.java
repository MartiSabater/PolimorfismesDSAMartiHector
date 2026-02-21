public abstract class Figura implements  Comparable<Figura> {
    public abstract double area ();

    public int compareTo(Figura f){
        return Double.compare(this.area(), f.area());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+area();
    }
}
