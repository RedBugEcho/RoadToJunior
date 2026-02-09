class MusicPlayer{
    private String songName;
    private int volume ;

    public MusicPlayer(String newSongName){
        this.songName = newSongName;
        this.volume = 5;
    }

    public void setVolume(int newVolume){
        if (newVolume >= 0 && newVolume <= 10) this.volume = newVolume;
        else System.out.println("Volume must be from 0 to 10.");
    }

    public void status(){
        System.out.println("Now is playing: " + songName + "| Volume: " + volume);
    }
}

public class ClassMusicPlayer {
    public static void main(String[] args) {
        MusicPlayer song1 = new MusicPlayer("You");

        song1.status();
        song1.setVolume(7);
        song1.status();
    }
}