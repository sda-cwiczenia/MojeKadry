package dao;

import model.Pracownik;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class PracownikDao {

    EntityManager entityManager;

    public PracownikDao() {
        entityManager = Persistence.createEntityManagerFactory("myDatabase").createEntityManager();
    }

    public Pracownik add(Pracownik pracownik) {
        Pracownik pracownik1;
        entityManager.getTransaction().begin();
        pracownik1 = entityManager.merge(pracownik);
        entityManager.getTransaction().commit();
        return pracownik1;
    }

    public Pracownik update(Pracownik pracownik) {
        Pracownik pracownik1;
        entityManager.getTransaction().begin();
        pracownik1 = entityManager.merge(pracownik);
        entityManager.getTransaction().commit();
        return pracownik1;
    }

    public void remove(Pracownik pracownik) {
        entityManager.getTransaction().begin();
        entityManager.remove(pracownik);
        entityManager.getTransaction().commit();
    }

    public List<Pracownik> findByImieAndNazwisko(String imie, String nazwisko) {

        List<Pracownik> pracownicy = entityManager.createQuery("select p from Pracownik p where p.imie = ?1 and p.nazwisko = ?2")
                .setParameter(1, imie).setParameter(2, nazwisko).getResultList();

        return pracownicy;
    }

}
