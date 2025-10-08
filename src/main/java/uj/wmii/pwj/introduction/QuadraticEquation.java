package uj.wmii.pwj.introduction;

public class QuadraticEquation {

    public double[] findRoots(double a, double b, double c) {

        if(a == 0 && b == 0 && c != 0) {
            return new double[]{};
        }
        if(a == 0 && b == 0 && c == 0) {
            return new double[]{};
        }

        if(a == 0) {
            return new double[]{-c/b};
        }
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta < 0) return new double[]{};
        if(delta == 0) return new double[]{-b/(2 * a)};
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return new double[]{x1, x2};
    }

}

