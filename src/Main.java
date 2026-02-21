public static void main(String[] args) {
    Figura[] v = new Figura[4];

    v[0] = new Rectangle(5, 3);
    v[1] = new Circle(5);
    v[2] = new Quadrat(5);
    v[3] = new Circle(120);

    double res = suma(v);

    System.out.println("sum: " + res);

   imprimir(v);

    ordena(v);

    imprimir(v);
}

private static void imprimir(Figura[] v) {
    System.out.println(v);
}

private static void ordena(Figura[] v) {
    Arrays.sort(v);
}

private static double suma(Figura[] v) {
    double res = 0;

    for (Figura f: v) {
        res+=f.area();
    }

    return res;
}
