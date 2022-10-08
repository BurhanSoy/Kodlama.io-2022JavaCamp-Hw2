package interfaces;

//Dal= Data Access Layer

public class MySqlCustomerDal implements CustomerDal, Repository{

    @Override
    public void add() {
        System.out.println("MySql eklendi");
    }
}
