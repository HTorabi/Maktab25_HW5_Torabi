import java.util.Scanner;

public class ElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Element[] element1 = new MetalElement[2];
        Element[] element2 = new NonMetalElement[2];
        int i=0,j=0;
        while (true){
            System.out.println("Metal or NonMetal?");
            if (scanner.nextLine().equalsIgnoreCase("Metal")) {

                element1[i]=new MetalElement(elementProducer()[0],Integer.parseInt(elementProducer()[1]),
                        Integer.parseInt(elementProducer()[2]));
                i++;
            }
            if (scanner.nextLine().equalsIgnoreCase("NonMetal")) {

                element2[j]=new NonMetalElement(elementProducer()[0],Integer.parseInt(elementProducer()[1]),
                        Integer.parseInt(elementProducer()[2]));
                j++;
            }


        }
    }
    static String[] elementProducer(){
        String[] ep=new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter its symbol");
        ep[0]=scanner.nextLine();
        System.out.println("Enter its Atomic number");
        ep[1]=scanner.nextLine();
        System.out.println("Enter its Atomic Weight");
        ep[2]=scanner.nextLine();
        return ep;

    }
}
