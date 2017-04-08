import java.awt.*;

/**
 * Created by cheyne on 4/6/17.
 */
public class Driver {
    public static void main(String[] args) {
        DrawstringPouch leatherBag =  new DrawstringPouch();

        leatherBag.openPouch();

        leatherBag.addMarble(16, Color.BLUE, "Polka dots");
        leatherBag.addMarble(25, Color.RED, "Glitter swirl");
        leatherBag.addMarble(35, Color.BLACK, "Universe");
        leatherBag.addMarble(16, Color.BLUE, "Speckled");
        leatherBag.addMarble(12, Color.MAGENTA, "Chinese checker");
        leatherBag.addMarble(12, Color.YELLOW, "Chinese checker");
        leatherBag.addMarble(16, Color.CYAN, "Cat eye");
        leatherBag.addMarble(16, Color.PINK, "Cat eye");
        leatherBag.addMarble(16, Color.ORANGE, "Tiger eye");
        leatherBag.addMarble(25, Color.DARK_GRAY, "Smokey haze");

        System.out.printf("There are %d marbles in the bag.%n", leatherBag.getQuantityOfMarbles());

        for (int i = 0; i < leatherBag.getQuantityOfMarbles(); i++) {
            System.out.printf("#%d: %s%n", i, leatherBag.getSpecificMarble(i));

        }
        System.out.printf("%nNow some random marbles from the collection:%n");

        

        System.out.println(leatherBag.getMarbleNumber(leatherBag.getRandomMarble()));
        System.out.println(leatherBag.getRandomMarble());
        System.out.println(leatherBag.getRandomMarble());
        System.out.println(leatherBag.getRandomMarble());


    }
}
