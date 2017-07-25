package barcelona.controller;

import barcelona.dao.model.Player;
import barcelona.service.interfaces.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @CrossOrigin
    @RequestMapping(value = "/addPlayer",method = RequestMethod.POST)
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        System.out.println("add player in controller!");
        playerService.addPlayer(player);
        return new ResponseEntity<Player>(player, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/getPlayers",method = RequestMethod.GET)
    public ResponseEntity<List<Player>> getPlayer(){
        System.out.println("get list players from controller");
        return new ResponseEntity<List<Player>>(playerService.listPlayers(), HttpStatus.OK);
    }
}
