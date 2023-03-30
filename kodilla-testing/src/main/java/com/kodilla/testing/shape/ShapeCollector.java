package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

       List<Shape> shapes = new ArrayList<>();

        public void addFigure (Shape shape){
            shapes.add(shape);
        }

        public void removeFigure (Shape shape){
            shapes.remove(shape);
        }

        public void getFigure (int n){
            shapes.get(n);
        }

        public String showFigures () {
            String figuresInOneString = "";
            for (int i = 0; i < shapes.size();i++){
                figuresInOneString += shapes.get(i);
            }
            return figuresInOneString;
        }
}
