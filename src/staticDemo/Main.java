package staticDemo;

// Kullanım alanlarımızdan birisi Utility dediğimiz araç yazarken kullanırız.

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="";

        manager.add(product);

//        DatabaseHelper.Crud.delete();
    }
}
