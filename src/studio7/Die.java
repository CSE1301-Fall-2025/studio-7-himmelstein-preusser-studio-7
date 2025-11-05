public class Die {
    private int numSides;

    public Die(int numSides) {
        this.numSides = numSides;
    }

    public int Roll() {
        return (int) (Math.random() * numSides + 1);
    }

    public static void main(String[] args) {
        Die d1 = new Die(8);

        System.out.println(d1.Roll());
        System.out.println(d1.Roll());
        System.out.println(d1.Roll());
    }
}
