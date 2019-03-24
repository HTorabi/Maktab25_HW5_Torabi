import java.util.Scanner;

public class ElementArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Element[] element1=new MetalElement[2];
        Element[] element2=new NonMetalElement[2];
        for (int i=0;i<2;i++) {
            System.out.println("Metal or NonMetal?");
            if (scanner.nextLine().equalsIgnoreCase("Metal")){



            }

        }
    }
    void elementInfo(){
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter its symbol");
        String symbol=scanner.nextLine();
        System.out.println("Enter its Atomic number");
        int atomicNum=scanner1.nextInt();
        System.out.println("Enter its Atomic Weight");
        int atomicWeight=scanner1.nextInt();
    }
}
