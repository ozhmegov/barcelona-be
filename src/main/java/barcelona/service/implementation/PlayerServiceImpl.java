package barcelona.service.implementation;

import barcelona.dao.implementation.PlayerDaoImpl;
import barcelona.dao.interfaces.PlayerDao;
import barcelona.dao.model.Player;
import barcelona.service.interfaces.PlayerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    private PlayerDao playerDao;

    @Override
    @Transactional
    public void addPlayer(Player player) {
        this.playerDao.addPlayer(player);
    }

    @Override
    @Transactional
    public Player getPlayerById(int id) {
        return this.playerDao.getPlayerById(id);
    }

    @Override
    @Transactional
    public void removePlayer(int id) {
        this.playerDao.removePlayer(id);
    }

    @Override
    @Transactional
    public void updatePlayer(Player player) {
        this.playerDao.updatePlayer(player);
    }

    @Override
    @Transactional
    public List<Player> listPlayers() {
        return this.playerDao.listPlayers();
    }

    /**
     * Sets playerDao.
     *
     * @param playerDao the new value.
     */
    public void setPlayerDao(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }
}
