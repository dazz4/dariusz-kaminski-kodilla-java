package shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList<Shape> figures;

    public ShapeCollector() {
        figures = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;

        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }

        return result;
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public int getFiguresQuantity() {
        return figures.size();
    }

    public String showFigures() {
        String result = "";

        for (Shape shape : figures) {
            result += shape.getShapeName() + ": " + shape.getField() + "\n";
        }

        return result;
    }


}
