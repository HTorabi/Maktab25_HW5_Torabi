public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, int atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println("Symbol: "+symbol);
        System.out.println("Atomic Number: "+atomicNumber);
        System.out.println("Atomic Weight: "+atomicWeight);
        System.out.println(" metals are good conductors of electricity");
        System.out.println("=============================================");
    }
}
