

public class Slnko {
    
    private Kruh kruh;
    
    private int poziciaX;
    private int poziciaY;
    
    
    
    public Slnko() {
        
        this.poziciaX = 700;
        this.poziciaY = 50;
        
        this.kruh = new Kruh();
        this.kruh.zmenFarbu("yellow");
        this.kruh.zmenPriemer(80);
        
        this.kruh.zobraz();
        
        this.kruh.posunVodorovne(this.poziciaX);
        this.kruh.posunZvisle(this.poziciaY);
        
    }
}
