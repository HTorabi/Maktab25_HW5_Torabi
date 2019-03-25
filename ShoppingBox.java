public class ShoppingBox {
    Goods g;
    int num;
    int ID;

     ShoppingBox(int ID,int num) {
         for (Goods g : GoodsList.goods) {
             if (g.ID == ID) {
                 if (g.number>=num) {
                     g.number -= num;
                     this.g = g;
                 }
                 else
                     System.out.println("Entry number is more than inventory");
             }
         }
         this.num=num;
         this.ID=ID;


    }
}
