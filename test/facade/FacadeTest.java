package facade;

import facade.hometheater.HomeTheaterFacade;
import facade.hometheater.subsystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacadeTest {
    HomeTheaterFacade homeTheaterFacade;

    @BeforeEach
    void setUp() {
        homeTheaterFacade = new HomeTheaterFacade(
                new Amplifier(),
                new Tuner(),
                new DvdPlayer(),
                new CdPlayer(),
                new Projector(),
                new TheaterLights(),
                new Screen(),
                new PopcornPopper()
        );
    }

    @Test
    void testHomeTheaterFacade() {
        homeTheaterFacade.watchMovie("The Matrix");
        homeTheaterFacade.endMovie();

        homeTheaterFacade.listenToCd("The Beatles");
    }

}