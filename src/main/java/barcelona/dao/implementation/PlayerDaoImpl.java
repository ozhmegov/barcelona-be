package barcelona.dao.implementation;

import barcelona.dao.interfaces.PlayerDao;
import barcelona.dao.model.Player;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PlayerDaoImpl implements PlayerDao {
    @PersistenceContext
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void addPlayer(Player player) {
        this.entityManager.persist(player);
    }

    @Override
    public Player getPlayerById(int id) {
        return this.entityManager.find(Player.class, id);
    }

    @Override
    public void removePlayer(int id) {
        Player player = this.entityManager.find(Player.class, id);
        this.entityManager.remove(player);
    }

    @Override
    public void updatePlayer(Player player) {
        if (!this.entityManager.contains(player)) {
            this.entityManager.merge(player);
        }
        this.entityManager.flush();
    }

    @Override
    public List<Player> listPlayers() {
        Query query = this.entityManager
                .createQuery(String
                        .format("SELECT p FROM %s p", Player.class.getSimpleName()));
        return query.getResultList();
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
