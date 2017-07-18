package barcelona.service.interfaces;

import barcelona.dao.model.Player;

import java.util.List;

public interface PlayerService {
    void addPlayer(Player player);
    Player getPlayerById(int id);
    void removePlayer(int id);
    void updatePlayer(Player player);
    List<Player> listPlayers();
}
