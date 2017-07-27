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
    public ResponseEntity<List<Player>> getPlayers(){
        System.out.println("get list players from controller");
        return new ResponseEntity<List<Player>>(playerService.listPlayers(), HttpStatus.OK);
    }

//    @CrossOrigin
//    @RequestMapping(value = "/getPlayer/{id}",method = RequestMethod.GET)
//    public ResponseEntity<Player> getPlayer(@PathVariable("id") int id){
//        System.out.println("get player from controller");
//        return new ResponseEntity<Player>(playerService.getPlayerById(id), HttpStatus.OK);
//    }

    @CrossOrigin
    @RequestMapping(value = "/removePlayer/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Integer> removePlayer(@PathVariable("id") int id){
        System.out.println("remove player from controller");
        playerService.removePlayer(id);
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/updatePlayer",method = RequestMethod.PUT)
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        System.out.println("update player in controller");
        playerService.updatePlayer(player);
        return new ResponseEntity<Player>(player, HttpStatus.OK);
    }
}
