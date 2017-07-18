package barcelona.dao.interfaces;

import barcelona.dao.model.Player;

import java.util.List;

public interface PlayerDao {
    void addPlayer(Player player);
    Player getPlayerById(int id);
    void removePlayer(int id);
    void updatePlayer(Player player);
    List<Player> listPlayers();
}
