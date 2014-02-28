package patternadaptations.facade;

/**
 * Project: PatternsBook
 * Date: 26.09.13
 * Time: 0:38
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Фасад предоставлять унифицированный интерфейс
 * к группе интерфейсов подсистемы. Фасад определяет высоко-
 * уровневый интерфейс, упрощающий работу с подсистемой.
 */
public class HomeTheaterTestDrive {
    private static Tuner tuner = new Tuner();
    private static DvdPlayer dvdPlayer = new DvdPlayer();
    private static Screen screen = new Screen();
    private static CdPlayer cdPlayer = new CdPlayer();

    public static void main(String[] args){

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(tuner, dvdPlayer, screen, cdPlayer);
        homeTheaterFacade.watchMovie("Washday");
        homeTheaterFacade.endMovie();
    }
}
