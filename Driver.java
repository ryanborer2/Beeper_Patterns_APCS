import kareltherobot.*;

public class Driver{
    public static void main(String[] args){
        World.setDelay(0);
        World.setVisible(true);
        World.setTrace(false);

        WorldBuilder.pattern12(11,11);
    }
}