public class GoodsShow {
    GoodsShow(Goods g,int where) {
        if (where == 0) {
            if (g.number >= 0) {
                goodsShow(g);

            }
        } else {
            if (g.number > 0) {
                goodsShow(g);
            }

        }
    }
    void goodsShow(Goods g){
        System.out.println("Code: " + g.ID);
        System.out.println("Type: " + g.type);

        if (g instanceof Shoes)
            System.out.println("Color: " + ((Shoes) g).color);
        if (g instanceof ElectricalDevices)
            System.out.println("Color: " + ((ElectricalDevices) g).color);
        if (g instanceof Book)
            System.out.println("Name: " + ((Book) g).name + "\n" + "Writer: " + ((Book) g).writter);
        if (g instanceof Magazine)
            System.out.println("Name: " + ((Magazine) g).name + "\n");
        System.out.println("Producer: " + g.producer);
        System.out.println("Price: " + g.price);
        System.out.println("Number: " + g.number);

        System.out.println("======================");
    }
}

