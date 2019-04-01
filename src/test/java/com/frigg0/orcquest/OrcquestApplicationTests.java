package com.frigg0.orcquest;

import com.frigg0.orcquest.model.turn.GetTurnFalse;
import com.frigg0.orcquest.model.turn.GetTurnTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrcquestApplicationTests {

    //@Test
    //public void contextLoads() {
     //   GetTurnTrue.getTurnTrue();
    //}

    @Test
    public void getTurnTrue(){
        GetTurnTrue.getTurnTrue();
    }

    @Test
    public void getTurnFalse(){
        GetTurnFalse.getTurnFalse();
    }
}
