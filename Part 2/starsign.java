// import java.util.Scanner;

public class starsign {
    public static void main(String[] args) {
        // print stars
        // printSquare(5);
        // printRectangle(17, 3);
        // printTriangle(4);
        // printRightTriangle(4);
        christmasTree(4);
    }
    
    public static void printStars(int number) {
        // print number of stars
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        // line break;
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // print number of spaces
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printSquare(int size) {
        // print rows
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        // print rectangle
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // print triangle
        for (int i = 0; i <= size; i++) {
            printStars(i);
        }
    }

    public static void printRightTriangle(int size) {
        // print right triangle
        for (int i = 0; i <= size; i ++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // print christmas tree
        for (int i = 0; i <= height; i++) {
            printSpaces(height-i);
            printStars(i*2 - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}