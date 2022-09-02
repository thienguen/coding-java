package Derived;

public class Complex_Operations {
    private double real;
    private double imaginary;

    public Complex_Operations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(Complex_Operations other) {
        this.real += other.getReal();
        this.imaginary += other.getImaginary();
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void subtract(Complex_Operations other) {
        this.real -= other.getReal();
        this.imaginary -= other.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
}