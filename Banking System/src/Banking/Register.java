package Banking;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Client> clients;

    public Register() {
        clients = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Cliente adicionado com sucesso.");
    }

    public List<Client> getClients() {
        return clients;
    }
}