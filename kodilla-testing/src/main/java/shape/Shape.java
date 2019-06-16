package shape;

public interface Shape {
    double getField();

    default String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
