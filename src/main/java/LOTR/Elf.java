package LOTR;

import LOTR.Strategies.ElfKick;

public class Elf extends Character{
    public Elf(){
        super(10,10, new ElfKick());
    }

    @Override
    public String toString() {
        return "Elf" + super.toString();
        }
}
