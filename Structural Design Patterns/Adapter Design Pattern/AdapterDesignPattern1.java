interface MediaPlayer {
    void play(String fileName);
}

class AdvancedMediaPlayer {
    public void playFile(String fileName) {
        System.out.println("Playing: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        advancedMediaPlayer.playFile(fileName);
    }
}

public class AdapterDesignPattern1 {
    
    public static void main(String[] args) {
        AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();
        MediaPlayer mediaPlayer = new MediaAdapter(advancedMediaPlayer);
        mediaPlayer.play("song.mp3");
    }
}
