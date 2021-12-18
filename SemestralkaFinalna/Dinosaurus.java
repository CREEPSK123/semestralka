
public class Dinosaurus {
    private Obdlznik obdlznik;
    private int pozicia;
    public Dinosaurus() {
        this.pozicia = 655;
        this.obdlznik = new Obdlznik();
        this.obdlznik.zmenStrany(10, 60);
        this.obdlznik.posunZvisle(this.pozicia - 50 - 30);
        this.obdlznik.zobraz();
        

        this.obdlznik.zobraz();

    }

    public boolean koliduje(int x ,int y){

        if (x > 290 || x< 10 ){
            if (y> this.pozicia - 30 && y < this.pozicia + 30)

                return true;
        }
        return false; 
    }

    public void skok() {
        if(this.pozicia > 30){

            this.obdlznik.posunHore();
            this.pozicia -= 20;
        }

    }

    public void posunDole() {
        if(this.pozicia < 270){

            this.obdlznik.posunDole();
            this.pozicia += 20;
        }

    } 

}
