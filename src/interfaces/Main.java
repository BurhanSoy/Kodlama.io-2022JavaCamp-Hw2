package interfaces;

public class Main {
    public static void main(String[] args) {

//    DataAccess, Business, Arayüz katmanlarının geçişlerini bağımlılıkları azaltmak için interface'leri kullanırız.
//    extends değil implements'tir.
//    Sınıflar birden fazla interface'i implemente edebilir. Yalnızca bir sınıfı ya da abstract sınıfı extend edebilir.

//  - interfaceler de abstract sınıflar gibi new'lenemez.
//    public static void main(String[] args) {
//        CustomerDal customerDal = new CustomerDal() {
//            @Override
//            public void add() {
//
//            }
//        };

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
//        customerManager.customerDal = new MySqlCustomerDal();
        customerManager.add();
    }
}
