package LOTR;

import java.util.Random;

import LOTR.Strategies.NobleKick;

public abstract class Noble extends Character{
    public Noble(int min, int max){
        super(
            min + new Random().nextInt(max - min),
            min + new Random().nextInt(max - min),
            new NobleKick()
        );
    }

}