package com.frigg0.orcquest.services.diceService;

import com.frigg0.orcquest.models.dice.DiceColorEnum;
import com.frigg0.orcquest.models.dice.DiceThrow;
import org.springframework.stereotype.Service;

@Service
public class DiceService {
    public DiceThrow doubleGreenDices(){
        return new DiceThrow(2, DiceColorEnum.G, DiceColorEnum.G);
    }

    public DiceThrow doubleYellowDices(){
        return new DiceThrow(2, DiceColorEnum.Y, DiceColorEnum.Y);
    }

    public DiceThrow doubleRedDices(){
        return new DiceThrow(2, DiceColorEnum.R, DiceColorEnum.R);
    }

    public DiceThrow oneGreenOneYellow(){
        return new DiceThrow(2, DiceColorEnum.G, DiceColorEnum.Y);
    }

    public DiceThrow oneYellowOneRed(){
        return new DiceThrow(2, DiceColorEnum.Y, DiceColorEnum.R);
    }
}
