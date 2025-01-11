/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author PC
 */
public class EquationSolver {
    private double a;
    private double b;
    private double c;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public EquationSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void solveSuperlative() {
        if (a == 0) {
            System.out.println("No solution!");
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }

    public void solveQuadratic() {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real solutions!");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Double solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void displaySolver(int type, double a, double b, double c) {
        if (type == 1) {
            EquationSolver solver = new EquationSolver(a, b);
            solver.solveSuperlative();
        } else if (type == 2) {
            EquationSolver solver = new EquationSolver(a, b, c);
            solver.solveQuadratic();
        } else {
            System.out.println("Invalid equation type.");
        }
    }
}
