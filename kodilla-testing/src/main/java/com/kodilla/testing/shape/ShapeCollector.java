package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

       List<Shape> shapes = new ArrayList<>();

        public void addFigure (Shape shape){
            shapes.add(shape);
        }

        public boolean removeFigure (Shape shape){
            boolean result = false;
            if (shapes.contains(shape)) {
                shapes.remove(shape);
                result = true;
            }
            return result;
        }

        public Shape getFigure (int n){
           return shapes.get(n);
        }

        public String showFigures () {
            String figuresInOneString = "";
            for (int i = 0; i < shapes.size();i++){
                String last;
                if (i == shapes.size() - 1){
                    figuresInOneString += shapes.get(i).getShapeName();
                }else {
                    figuresInOneString += (shapes.get(i).getShapeName() + ", ");
                }
            }
            return figuresInOneString;
        }
}