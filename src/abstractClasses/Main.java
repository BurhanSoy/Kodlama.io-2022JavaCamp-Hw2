package abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

//      - new'leyebilmek için override etmemiz gerekiyor. Uygun kullanım değil.
//        GameCalculator gameCalculator = new GameCalculator() {
//            @Override
//            public void hesapla() {
//
//            }
//        };

        GameCalculator gameCalculators = new WomanGameCalculator();

    }
}
