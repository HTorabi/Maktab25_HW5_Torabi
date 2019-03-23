public class ShoppingBox {
    ShoppingBox(int ID,int number){
        for (Goods g:GoodsList.goods){
            if (g.ID==ID) {
                g.number-=number;
                new GoodsShow(g);
            }
        }

    }
}
