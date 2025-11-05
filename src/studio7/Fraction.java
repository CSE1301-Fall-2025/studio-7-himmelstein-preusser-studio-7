public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String Add(Fraction f1, Fraction f2) {
        if (f1.denominator == f2.denominator) {
            String sum = f1.numerator + f2.numerator + "/" + denominator;
            return sum;
        }
        String sum = f1.numerator * f2.denominator + f2.numerator * f1.denominator + "/"
                + f1.denominator * f2.denominator;
        return sum;
    }

    public String Multiply(Fraction f1, Fraction f2) {
        String product = f1.numerator * f2.numerator + "/" + f1.denominator * f2.denominator;
        return product;
    }

    public String Reciprocal() {
        int a = numerator;
        int b = denominator;
        this.numerator = b;
        this.denominator = a;
        String fraction = numerator + "/" + denominator;
        return fraction;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 7);
        Fraction f2 = new Fraction(6, 11);

        System.out.println(f1.Add(f1, f2));
        System.out.println(f1.Multiply(f1, f2));
        System.out.println(f1.Reciprocal());
    }
}
