package soundbox;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("lonelyHeartsClub")
@RockBand
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}