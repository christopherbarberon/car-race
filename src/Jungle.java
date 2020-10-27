
import java.util.Random;
public class Jungle {
    public static Random s_Random = new Random();
    public static Terrain s_terrain = new Terrain();


    public static void main(String[] args) {
        Weather weather = new Weather(s_terrain);


        weather.step();
        s_terrain.step();
        s_terrain.draw();

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*while (terrain.hasLivingCreatures()){    //mettre le code dedans apres

        }
        */
    }
    public static Terrain getTerrain(){
        return s_terrain;
    }
}
