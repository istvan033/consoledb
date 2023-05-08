package consoledb;

public class gyumi {
    private int id;
    private String nev;
    private int suly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSuly() {
        return suly;
    }

    public void setSuly(int suly) {
        this.suly = suly;
    }

    public gyumi(int id, String nev, int suly) {
        this.id = id;
        this.nev = nev;
        this.suly = suly;
    }
    
    public gyumi(String nev, int suly) {
        this.id = 0;
        this.nev = nev;
        this.suly = suly;
    }


}
