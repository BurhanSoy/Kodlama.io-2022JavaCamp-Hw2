package abstractClasses;

public abstract class GameCalculator {

    //abstract bir sınıfta abstract metod olmak zorunda değil
    //birçok abstract metod ve bircok tamamlanmış operasyonumuz olabilir.
    //abstract ile hesaplayı kullanmak zorunda ama override etmek zorunda bırakıyoruz.
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun Bitti!");
    }
}
