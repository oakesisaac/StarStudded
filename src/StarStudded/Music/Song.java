package StarStudded.Music;

import StarStudded.Artist;


public class Song {
    
    private static final int MAX_FEATURES = 8;
    private String songTitle;
    private Artist songArtist;
    private Artist[] songFeaturingArtist;
    private Instrumental songIntrumental;
    private Vocals songVocals;
    
    public Song(String st, Artist sa, Instrumental si, Vocals sv) {
        songTitle = st;
        songArtist = sa;
        songIntrumental = si;
        songVocals = sv; 
        songFeaturingArtist = new Artist[MAX_FEATURES];
    }
    
    
}
