
package StarStudded;

import StarStudded.Music.Album;

public class Artist extends Human {
    
    private Album[] albums;
    
    private int level;
    private double lyrics;
    private double stagePresence;
    private double appearance;
    
    
    
    public Artist(String fn, String ln, String ht, char g, int a, String newGenre) {
        super(fn,ln,ht,g,a);
        level = 0;
    }   
    
}
