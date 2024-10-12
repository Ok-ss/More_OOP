package LOTR.Strategies;

public class HobbitKick implements KickStrategy{

    @Override
    public int kick(LOTR.Character kickAuthor, LOTR.Character c){
        toCry();
        return 0;
    }

    private static void toCry(){
        System.err.println("😭😭😭");
    }
    
}
