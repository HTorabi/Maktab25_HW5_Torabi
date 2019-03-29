public class GoodsList {
    static Goods lgRadio=new Radio(1,"Analog","LG",50_000,15,"BLACK");
    static Goods sonyRadio=new Radio(2,"Digital","SONY",150_000,12,"WHITE");
    static Goods lgTele=new Television(3,"Digital pro","LG",2000_000,10,"GREY");
    static Goods samsungTele=new Television(4,"Digital 3D","SAMSUNG",4500_000,4,"BLACK");
    static Goods nike=new SportShoes(5,"sport for men","NIKE",250_000,32, Shoes.Color.BLACK);
    static Goods adidas=new SportShoes(6,"sport for Women","ADIDAS",250_000,32, Shoes.Color.WHITE);
    static Goods formalShoes=new FormalShoes(7,"formal for men and women","BATA",110_000,25, Shoes.Color.BROWN);
    static Goods roman=new Book(8,"novel","Hill",95000,15,"Pride & Prejudice","Jane Austen");
    static Goods[] goods={lgRadio,sonyRadio,lgTele,samsungTele,nike,adidas,formalShoes,roman};

}
