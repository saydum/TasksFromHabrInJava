package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MiniMarket implements Store {
    private List<Client> clients;
    private String newProduct;

    public MiniMarket() {
        clients = new ArrayList<>();
    }

    public void setNewProduct(String news) {
        this.newProduct = news;
        notifyClient();
    }

    @Override
    public void registrationClient(Client client) {
        clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyClient() {
        for (Client client : clients) {
            client.update(newProduct);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getNewProduct() {
        return newProduct;
    }
}
