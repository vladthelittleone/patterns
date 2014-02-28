package patternadaptations.facade;

/**
 * Project: PatternsBook
 * Date: 26.09.13
 * Time: 0:22
 *
 * @author Skurishin Vladislav
 */
public class HomeTheaterFacade {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    Screen screen;
    CdPlayer cdPlayer;

    public HomeTheaterFacade(Tuner tuner, DvdPlayer dvdPlayer, Screen screen, CdPlayer cdPlayer) {
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
        this.cdPlayer = cdPlayer;
    }

    public void watchMovie(String movie){
        System.out.println ("Get ready to watch a movie...");
        tuner.on();
        screen.on();
        cdPlayer.off();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println ("Shutting movie theater down...");
        tuner.off();
        screen.off();
        cdPlayer.off();
        dvdPlayer.off();
    }

}
