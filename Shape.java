public class Shape {
    public String coler = "green";
    public  boolean filler = true;
    public Shape(){

    }

    public Shape(String coler, boolean filler) {
        this.coler = coler;
        this.filler = filler;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "coler='" + coler + '\'' +
                ", filler=" + filler +
                '}';
    }
}
