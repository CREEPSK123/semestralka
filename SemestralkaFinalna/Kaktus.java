

public class Kaktus {
    
    private static final int PRIEMER = 30;
    
    private Kruh kruh;
    private int poziciaX;
    private int poziciaY;
    private int posunX;
    private int posunY;
    
    
    
    public Kaktus() {
       
        this.poziciaX = 980;
        this.poziciaY = 670;
        
        this.posunX = 30;
        this.posunY = 0;
        
        this.kruh = new Kruh();
        this.kruh.zmenFarbu("red");
        this.kruh.zmenPriemer(30);
        
        
        this.kruh.posunVodorovne(this.poziciaX - 30 - PRIEMER / 2 );
        this.kruh.posunZvisle(this.poziciaY - 60 - PRIEMER / 2);
        this.kruh.zobraz();
        
    }
    
    public void posunSa() {
    
    
        
        
        
        
        
        this.kruh.posunVodorovne(-this.posunX);
        
        this.poziciaX += this.posunX;
        this.poziciaY += this.posunY;
        
    
    }
    
    public void umiestniSa() {
    
        this.kruh.posunVodorovne(this.poziciaX);
        this.kruh.posunZvisle(this.poziciaY);
        this.poziciaX = 995;
        
        this.posunY = -this.posunY;   
        this.posunX = -this.posunX;
        
        
        
    }
    
}

