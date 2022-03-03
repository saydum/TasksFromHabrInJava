package designPatterns.observer;

public interface Store {
    void registrationClient(Client client);
    void removeClient(Client client);
    void notifyClient();
}
