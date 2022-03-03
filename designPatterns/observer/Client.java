package designPatterns.observer;

public class Client {
    private String name;

    public Client(String name, Store store) {
        this.name = name;
        store.registrationClient(this);
    }
    public void update(String newProduct) {
        System.out.println(name + " - Поступил новый товар: " + newProduct);
    }
}
