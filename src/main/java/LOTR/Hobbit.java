package LOTR;

import LOTR.Strategies.HobbitKick;

public class Hobbit extends Character{
    public Hobbit(){
        super(0, 3, new HobbitKick());
    }

    @Override
    public String toString() {
        return "Hobbit" + super.toString();
        }
}
