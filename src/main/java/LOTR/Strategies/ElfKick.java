package LOTR.Strategies;

import LOTR.Character;

public class ElfKick implements KickStrategy{

    @Override
    public int kick(Character kickAuthor, Character kickVictim) {
        boolean is_weaker = kickVictim.getPower() < kickAuthor.getPower();
        int damage;
        if (is_weaker){
            damage = kickVictim.getHp();
        }
        else{
            damage = 1;
        }
        kickVictim.setHp(kickVictim.getHp()-damage);
        return damage;
    }

    
    
}
