import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by cheyne on 4/6/17.
 */
class DrawstringPouch {
    private ArrayList<Marble> marbleCollection = new ArrayList<>();
    private boolean isOpen;
    private String bagMaterial;

    DrawstringPouch() {
        bagMaterial = "Unbleached Cotton";
        isOpen = true;
    }

    void addMarble(int size, Color color, String style) {
        marbleCollection.add(new Marble(size, color, style));
    }

    Marble getRandomMarble() {
        Random randy = new Random();
        int randomNum = randy.nextInt(marbleCollection.size());
        return marbleCollection.get(randomNum);
    }

    Marble getSpecificMarble(int specifiedMarbleNum) {
        return marbleCollection.get(specifiedMarbleNum);
    }

    int getQuantityOfMarbles() {
        return marbleCollection.size();
    }

    int getMarbleNumber(Marble whatNumIsThisMarble) {
        return marbleCollection.indexOf(whatNumIsThisMarble);
    }

    void openPouch() {
        isOpen = true;
    }

    void closePouch() {
        isOpen = false;
    }

}
