package LOTR;

import LOTR.Strategies.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;


    public boolean isAlive(){
        return hp>0;
    }
    
    public void kick(Character c){
        int damage = getKickStrategy().kick(this, c);
        System.out.println(toString() + " deals " + damage + " points of damage to " + c.toString());
        System.out.println(c.toString() + "'s Hp is now " + c.getHp());
    }

    public String toString(){
        return "{hp=" + getHp() + ", power=" + getPower() +"}";
    }

    public void setHp(int hp){
        if (hp>0){
            this.hp = hp; 
        } else {
            this.hp = 0;
        }
    }
}

