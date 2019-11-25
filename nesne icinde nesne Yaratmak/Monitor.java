public class Monitor{

    private String model;
    private String uretici;
    private String boyut;
    private Resulation resulation;

    public Monitor(String model,String uretici,String boyut,Resulation resulation){

        this.model=model;
        this.uretici=uretici;
        this.boyut=boyut;
        this.resulation=resulation;
    }

    public void monitoru_kapat(){

        System.out.println("monitor kapanıyor ...");
    }

    public void setModel(String model){

        this.model=model;
    }
    public String getModel(){

        return model;
    }

    public void setUretici(String uretici){

        this.uretici=uretici;
    }
    public String getUretici(){

        return uretici;
    }

    public void setBoyut(String boyut){

        this.boyut=boyut;
    }
    public String getBoyut(){

        return boyut;
    }

    public void SetResulation(Resulation resulation){

        this.resulation=resulation;
    }
    public Resulation getResulation(){

        return resulation;
    }
}