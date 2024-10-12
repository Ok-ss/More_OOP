package LOTR.Strategies;

import LOTR.Character;

public class NobleKick implements KickStrategy{

    @Override
    public int kick(Character kickAuthor, Character kickVictim) {
        int damage = Math.min(kickAuthor.getPower(), kickVictim.getHp());
        kickVictim.setHp(kickVictim.getHp() - damage);
        return damage;
    }
    
}
