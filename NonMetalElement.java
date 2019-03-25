public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, int atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }
    @Override
    void describeElement() {
        System.out.println("Symbol: "+symbol);
        System.out.println("Atomic Number: "+atomicNumber);
        System.out.println("Atomic Weight: "+atomicWeight);
        System.out.println("nonmetals are poor conductors");
    }
}
