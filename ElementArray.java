import java.util.Scanner;

public class ElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Element[] element = new MetalElement[5];
        int i = 0, m = 0, n = 0;
        while (true) {
            if (n == 3)
                System.out.println("We need a metal");
            if (m == 3)
                System.out.println("We need a Nonmetal");
            System.out.println("Metal or NonMetal?");
            if (scanner.nextLine().equalsIgnoreCase("Metal")) {

                element[i] = new MetalElement(elementProducer()[0], Integer.parseInt(elementProducer()[1]),
                        Integer.parseInt(elementProducer()[2]));
                i++;
                m++;
            }
            if (scanner.nextLine().equalsIgnoreCase("NonMetal")) {

                element[i] = new NonMetalElement(elementProducer()[0], Integer.parseInt(elementProducer()[1]),
                        Integer.parseInt(elementProducer()[2]));
                i++;
                n++;
            }
            if (i==5)
                break;


        }
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
