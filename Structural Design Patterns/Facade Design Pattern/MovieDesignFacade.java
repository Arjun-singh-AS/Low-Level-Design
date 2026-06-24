class Amplifier {
    void on() { System.out.println("Amplifier ON"); }
    void off() { System.out.println("Amplifier OFF"); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void off() { System.out.println("Projector OFF"); }
}

class SoundSystem {
    void on() { System.out.println("Sound System ON"); }
    void off() { System.out.println("Sound System OFF"); }
}

class MovieFacade {
    private Amplifier amplifier;
    private Projector projector;
    private SoundSystem soundSystem;

    public MovieFacade(Amplifier amplifier, Projector projector, SoundSystem soundSystem) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        projector.on();
        soundSystem.on();
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        amplifier.off();
        projector.off();
        soundSystem.off();
    }
}

public class MovieDesignFacade {
    
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        MovieFacade movieFacade = new MovieFacade(amplifier, projector, soundSystem);
        movieFacade.watchMovie();
        // Simulate watching the movie
        movieFacade.endMovie();
    }
}
