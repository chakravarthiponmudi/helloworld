package soundsystem;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundbox.CDPlayerConfig;
import soundbox.CompactDisc;
import soundbox.MagicBean;
import soundbox.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
@ActiveProfiles("prod")
public class CDPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

//    @Autowired
//    @Qualifier("mariAmma")
//    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp3Player;



//    @Test
//    public void cdShouldNotBeNull() {
//        assertNotNull(cd);
//    }

    @Test
    public void play() {
        log.clearLog();
        mp3Player.play();
        assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band" +
                        " by The Beatles\n",
                log.getLog());

    }

    @Autowired
    private MagicBean magic;

    @Test
    public void checkMagic() {
        magic.showMagic();
        assertNotNull(magic);
    }
}