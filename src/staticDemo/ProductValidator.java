package staticDemo;

//Ana class static olamaz ancak inner class'lar static olabilir.
//Bir ürünü kaydederken, güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanırız.

public class ProductValidator {

//    Static yapıcı blok.
//    Birden fazla operasyon yapılacaksa birden fazla yapıcı blok çalıştırılabilir.
    static {
        System.out.println("yapıcı blok çalıştı");
    }
    static {
        System.out.println("yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

//inner class
    public static class BaskaBirClass{
        public static void sil(){
//      gruplandırma için kullanılır.
        }
    }
}
