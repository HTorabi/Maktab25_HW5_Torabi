import java.util.Scanner;

public class ElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Element[] element=new Element[5];
        int i=0;
        int mCounter=0;
        int nCounter=0;
        while (true) {
            System.out.println("Metal or nonMetal?");
            String s=scanner.nextLine();
            if (s.equalsIgnoreCase("metal")){
                if (element.length-mCounter>2) {
                    String[] metal = elementProducer();
                    element[i] = new MetalElement(metal[0], Integer.parseInt(metal[1]), Integer.parseInt(metal[2]));
                    i++;
                    mCounter++;
                }
                else
                    System.out.println("we need a nonmetal");
            }
            if (s.equalsIgnoreCase("nonmetal")) {
                if (mCounter >= 2) {
                    String[] nonmetal = elementProducer();
                    element[i] = new NonMetalElement(nonmetal[0], Integer.parseInt(nonmetal[1]), Integer.parseInt(nonmetal[2]));
                    i++;
                    nCounter++;
                }
                else
                    System.out.println("we need at least two metals");
            }
            if (i==element.length)
                break;

        }
        for(Element e:element)
            e.describeElement();

    }

    static String[] elementProducer() {
        String[] ep = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter its symbol");
        ep[0] = scanner.nextLine();
        System.out.println("Enter its Atomic number");
        ep[1] = scanner.nextLine();
        System.out.println("Enter its Atomic Weight");
        ep[2] = scanner.nextLine();
        return ep;

    }
}
