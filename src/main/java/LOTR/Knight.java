package LOTR;

public class Knight extends Noble{
    public Knight(){
        super(2, 12);
    }
    
    @Override
    public String toString() {
        return "Knight" + super.toString();
        }
}
