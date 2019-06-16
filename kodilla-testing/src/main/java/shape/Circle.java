package shape;

public class Circle implements Shape {

    int field;

    public Circle(int field) {
        this.field = field;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getName();
    }
}
