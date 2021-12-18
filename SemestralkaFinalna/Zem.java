

public class Zem {
    
        private int poziciaX;
        private int poziciaY;
        private Obrazok obrazok;
    
    public Zem() {
        
        this.poziciaX = 0;
        this.poziciaY = 0;
        
        this.obrazok = new Obrazok("Pics//sem.jpg");
        
        
        this.obrazok.posunVodorovne(-100);
        
        
        
        this.obrazok.zobraz();
        
        
    }
    
   
    
}
