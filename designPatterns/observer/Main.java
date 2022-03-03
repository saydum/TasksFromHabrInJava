package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        var miniMarket = new MiniMarket();

        new Client("Jon", miniMarket);
        new Client("Sony", miniMarket);
        new Client("Ivan", miniMarket);

        miniMarket.setNewProduct("Samsung s98 ");
    }
}
