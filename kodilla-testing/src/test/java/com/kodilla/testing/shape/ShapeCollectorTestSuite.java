package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    ShapeCollector shapeCollector = new ShapeCollector();


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circles")
    class TestCircle {

        Circle circle = new Circle(5);

        @Test
        void testAddFigure() {
            //Given
            Shape shape1 = new Circle(13);
            //When
            shapeCollector.addFigure(shape1);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            shapeCollector.addFigure(circle);
            //When
            boolean result = shapeCollector.removeFigure(circle);
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            //Given
            shapeCollector.addFigure(circle);
            //When
            Shape shape1 = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(circle, shape1);
        }

        @Test
        void testShowFigures() {
            //Given
            shapeCollector.addFigure(circle);
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("Koło", result);
        }
    }
    @Nested
    @DisplayName("Tests for Triangle")
    class TestTriangle {

        Triangle triangle = new Triangle(10, 12);

        @Test
        void testAddFigure() {
            //Given
            Shape shape1 = new Triangle(12,2);
            //When
            shapeCollector.addFigure(shape1);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            shapeCollector.addFigure(triangle);
            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            //Given
            shapeCollector.addFigure(triangle);
            //When
            Shape shape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, shape);
        }

        @Test
        void testShowFigures() {
            //Given
            shapeCollector.addFigure(triangle);
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("Trójkąt", result);
        }
    }

    @Nested
    @DisplayName("Tests for Square")
    class TestSquare {

        Square square = new Square(4);

        @Test
        void testAddFigure() {
            //Given
            Shape shape1 = new Triangle(12,2);
            //When
            shapeCollector.addFigure(shape1);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            shapeCollector.addFigure(square);
            //When
            boolean result = shapeCollector.removeFigure(square);
            //Then
            Assertions.assertTrue(result);
        }

        @Test
        void testGetFigure() {
            //Given
            shapeCollector.addFigure(square);
            //When
            Shape shape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, shape);
        }

        @Test
        void testShowFigures() {
            //Given
            shapeCollector.addFigure(square);
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals("Kwadrat", result);
        }
    }
}