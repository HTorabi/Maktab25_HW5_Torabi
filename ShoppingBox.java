public class ShoppingBox {
    Goods g;
    int num;
    int ID;

     ShoppingBox(int ID,int num) {
         for (Goods g : GoodsList.goods) {
             if (g.ID == ID) {
                 g.number -= num;
                 this.g = g;
             }
         }
         this.num=num;
         this.ID=ID;


    }
}
