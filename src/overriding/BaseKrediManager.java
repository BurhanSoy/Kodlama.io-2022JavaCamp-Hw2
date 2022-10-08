package overriding;

public class BaseKrediManager {

    //Final keyword ile bir metodu işaretlersek override edemeyiz.
    public double hesapla(double tutar){
        return tutar*1.18;
    }
}
