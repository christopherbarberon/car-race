
import java.util.Random;
public class Jungle {
    public static Random s_Random = new Random();
    public static void main(String[] args) {
        Terrain terrain = new Terrain();
        Weather weather = new Weather(terrain);


        weather.step();
        terrain.step();
        terrain.draw();

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*while (terrain.hasLivingCreatures()){    //mettre le code dedans apres

        }
        */
    }
}
