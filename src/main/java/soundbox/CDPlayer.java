package soundbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    @RockBand
    public void SetCompatcDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
