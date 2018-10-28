package soundbox;

import org.springframework.stereotype.Component;
@Component
public class MariAmma implements CompactDisc {
    private String title = "MariAmma";
    private String artist = "The Beatles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}