public class Bilgisayar{

    private Anakart anakart;
    private Kasa kasa;
    private Monitor monitor;

    public Bilgisayar(Anakart anakart,Kasa kasa,Monitor monitor){

        this.anakart=anakart;
        this.kasa=kasa;
        this.monitor=monitor;
    }
    public void bilgisayari_calistir(){

        System.out.println("bilgisayar calisiyor");
    }

    public void setAnakart(Anakart anakart){

        this.anakart=anakart;
    }
    public Anakart getAnakart(){

        return anakart;
    }

    public void setKasa(Kasa kasa){

        this.kasa=kasa;
    }
    public Kasa getKasa(){

        return kasa;
    }

    public void setMonitor(Monitor monitor){

        this.monitor=monitor;
    }

    public Monitor getMonitor(){

        return monitor;
    }
}