import entites.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestConnection {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit",
                System.getProperties());
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Client client = new Client();
        client.setUser_name("Dima");
        client.setFax_number("4444444");
        client.setSecond_address("Baranovichi");

        entityManager.persist(client);
        entityManager.getTransaction().commit();

        entityManager.close();
        System.out.println("Id = "+ client.getIdClient());
    }
}
