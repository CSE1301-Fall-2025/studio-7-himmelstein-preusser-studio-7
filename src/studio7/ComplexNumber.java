public class ComplexNumber {
    private double imaginary;
    private double real;

    public ComplexNumber(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public String Add(ComplexNumber c1) {
        String sum = (real + c1.real) + " " + (imaginary + c1.imaginary) + "i";
        return sum;
    }

    public String Product(ComplexNumber c1) {
        String product = (real * c1.real - imaginary * c1.imaginary) + " " + (real * c1.imaginary + c1.real * imaginary)
                + "i";
        return product;
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 4);
        ComplexNumber c2 = new ComplexNumber(7, 9);

        System.out.println(c1.Add(c2));
        System.out.println(c1.Product(c2));
    }
}
