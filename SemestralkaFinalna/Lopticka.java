
public class Lopticka {

    private static final int PRIEMER = 20;

    private Kruh kruh;
    private int poziciaX;
    private int poziciaY;
    private int posunX;
    private int posunY;

    public Lopticka() {
        this.poziciaX = 150;
        this.poziciaY = 150;

        // nastavujem smer pohybu
        this.posunX = 15;
        this.posunY = -3;

        this.kruh = new Kruh();
        this.kruh.zmenFarbu("red");
        this.kruh.zmenPriemer(20);
        //20 zakladna pozicia,10  polovica polomeru, 150 stred 
        this.kruh.posunVodorovne(this.poziciaX - 20 - PRIEMER / 2);
        this.kruh.posunZvisle(this.poziciaY - 60 - PRIEMER / 2);
        this.kruh.zobraz();
    }

    public void posunSa(Odrazadlo praveOdrazadlo,Odrazadlo laveOdrazadlo) {
        if (this.poziciaY <= PRIEMER/2 || this.poziciaY >= 300 - PRIEMER/2){ 
            this.posunY = -this.posunY;
        }   
            if (this.poziciaX <= PRIEMER / 2 || this.poziciaX >= 300 - PRIEMER / 2){
               this.umiestniSa();
                
        }   
        
        if (laveOdrazadlo.koliduje(this.poziciaX - PRIEMER / 2,this.poziciaY)){
          this.posunX = -this.posunX;
        }  
            if (praveOdrazadlo.koliduje(this.poziciaX + PRIEMER / 2,this.poziciaY)){
            this.posunX = -this.posunX;
        }
            
        this.kruh.posunVodorovne(this.posunX);
        this.kruh.posunZvisle(this.posunY);
        this.poziciaX += this.posunX;
        this.poziciaY += this.posunY;

    }  
    public void umiestniSa(){
        this.kruh.posunVodorovne(150 - this.poziciaX);
        this.kruh.posunZvisle(150 - this.poziciaY);
        this.poziciaX = 150;
        this.poziciaX = 150;
        this.posunY = -this.posunY;     
        this.posunX = -this.posunX;
    }
    
    
}