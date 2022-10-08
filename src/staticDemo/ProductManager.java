package staticDemo;

public class ProductManager {
    public void add(Product product){

//        Manager sınıflar static olamaz.
//        yardımcı araçlar static olabilir.
//        Bir metodu static olarak tanımladığımızda sınıfın adı ile çağırılabilir.
//        new'lemeden gelmesi için static kullandık.
//        her yerde static kullanamıyoruz. new'deki gibi bellekte geçici yer tutmuyor.
//        ProductValidator validator = new ProductValidator();

        if (ProductValidator.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Ürün bilgileri geçersizdir");
        }
    }
}
