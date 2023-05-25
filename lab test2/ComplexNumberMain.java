public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(1.0, 2.0);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");

        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");

        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}
