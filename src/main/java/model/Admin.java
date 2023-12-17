import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class Admin extends person{
    public List<Vet>Vets=new ArrayList<>();
    public List<Client> clientList=new ArrayList<>();
    // Set data for 5 Client objects
        for (int i = 0; i < 20; i++) {
        Client client = new Client();
        client.setName("Client" + (i + 1));
        client.setId("ClientID" + (i + 1));
        client.setEmail("client" + (i + 1) + "@gmail.com");
        
        // Set password and phone number differently for each client
        client.setPassword(generateRandomPassword());
        client.setPhone(generateRandomPhoneNumber());

        // Add the client object to the ArrayList
        clientList.add(client);
    }

    private static String generateRandomPassword() {
        return "RandomPassword" + (int) (Math.random() * 1000);
    }

    private static String generateRandomPhoneNumber() {
        return "RandomPhoneNumber" + (int) (Math.random() * 1000000000);
    }
    public List<MoneyDonation>AllDonatedMoney=new ArrayList<>();
    public List<Pet>AllPets=new ArrayList<>();
    public List<OperationRoom>AllRooms=new ArrayList<>();
}
