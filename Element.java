public abstract class Element {
    String symbol;
    int atomicNumber;
    int atomicWeight;

    public Element(String symbol, int atomicNumber, int atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public int getAtomicWeight() {
        return atomicWeight;
    }
    abstract void describeElement();
}
