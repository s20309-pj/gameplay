package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.entity.Player;

import java.util.List;


@Service
public class PlayerService {


public List<Player> findAll(){

return List.of( new Player( 1,"Hopsasa do lasa", 10, 100),
        new Player(2, "Baba Yaga",30,400),
        new Player(3,"Adam Padam",15,500));
}


}
