package polymorphismDemo;

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger= logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");

//        databaselogger'a bağlıyım demek.
//        DatabaseLogger logger = new DatabaseLogger();
//        logger.log("log mesajı");
//        Böyle bağımlı sistemler yapmak yerine baselogger türünde private alan oluşturuyoruz.
    }
}
