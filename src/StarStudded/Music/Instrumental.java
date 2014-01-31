
package StarStudded.Music;

import StarStudded.Producer;


public class Instrumental {
    private String title;
    private Producer prodBy;
    private int cost;
    
    public Instrumental(String t, Producer p, int c) {
        title = t;
        prodBy = p;
        cost = c;
        p.addInstrumental(this);
    }
    
    public String getTitle() {
        return title;
    }
    
    public Producer getProducer() {
        return prodBy;
    }
    
    public int getCost() {
        return cost;
    }
}
