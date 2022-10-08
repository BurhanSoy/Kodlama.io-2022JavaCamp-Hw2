package interfaces;

public class CustomerManager {

    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal){
        this.customerDal= customerDal;
    }

//    Dal'ın içinde add vardı.
//    Bu metod Dal'ı çağıracak.

    public void add(){
//    iş kodları yazılır. (Müşteriyi eklemek için parametre göndereceğiz. Adı girilmiş mi?Doğru mu?)
        customerDal.add();
    }
}
