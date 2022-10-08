package abstractDemo;

public class CustomerManager {

//    Strateji pattern'i.

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
//        kullanırken hangi veritabanı sistemini verirsek onun getDatası çalışacak.
        databaseManager.getData();

//        Bu şekilde artık oracle'a bağımlıyız.
//        OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
//        Bağımlı olmamak için strateji pattern'ini kullanacağız.
    }
}
