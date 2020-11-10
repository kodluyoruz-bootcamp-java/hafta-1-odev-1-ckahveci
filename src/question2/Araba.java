package question2;

public class Araba {

    private int modelYili;
    private int kapiSayisi;
    private int beygirGucu;
    private String yakitTürü;
    private String vitesTipi;
    private String marka;

    public Araba(String marka, int modelYili) {

        this.marka = marka;
        this.modelYili = modelYili;

    }

    public Araba(int beygirGucu, String yakitTürü, String vitesTipi) {

        this.beygirGucu = beygirGucu;
        this.yakitTürü = yakitTürü;
        this.vitesTipi = vitesTipi;

    }


    public Araba(String marka, int modelYili,int beygirGucu, String yakitTürü, String vitesTipi,int kapiSayisi) {

        this.marka = marka;
        this.kapiSayisi = kapiSayisi;
        this.modelYili = modelYili;
        this.beygirGucu = beygirGucu;
        this.yakitTürü = yakitTürü;
        this.vitesTipi = vitesTipi;


    }

}
