class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(diffReal, diffImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double mulReal = this.real * other.real - this.imaginary * other.imaginary;
        double mulImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(mulReal, mulImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double divReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double divImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new ComplexNumber(divReal, divImaginary);
    }
}
