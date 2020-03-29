public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape = new Shape("black",false);
        System.out.println(shape);
        Triangle triangle = new Triangle();
        triangle = new Triangle("bliue",true,3.0,3.0,3.0);
        System.out.println(triangle);
    }
}
