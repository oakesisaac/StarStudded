package StarStudded;
import StarStudded.Music.Instrumental;
import java.util.ArrayList;
import java.util.List;


public class Producer extends Human {
    
    private List<Instrumental> catalog;
    
    public Producer(String fn, String ln, String ht, char g, int a) {
        super(fn,ln,ht,g,a);
        catalog = new ArrayList<Instrumental>();
    }
    
    public void addInstrumental(Instrumental instr) {
        catalog.add(instr);
    }
    
    public Instrumental findInstrumental(String find) {
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).getTitle().equalsIgnoreCase(find)) {
                return catalog.get(i);
            }
        }
        
        return null;
    }
    
    
    
    
    
    
    
}
