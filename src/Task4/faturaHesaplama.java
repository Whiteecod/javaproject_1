package Task4;

public class faturaHesaplama {
    private float aylikFatura;
    private int elektrikTüketimi;
    private float birimFiyati;
    private int yeniOkuma;
    private int eskiOkuma;


    public faturaHesaplama(int yeniOkuma, int eskiOkuma) {
        this.yeniOkuma = yeniOkuma;
        this.eskiOkuma = eskiOkuma;
        this.elektrikTüketimi = this.yeniOkuma - this.eskiOkuma;
        this.birimFiyati = (float) belirleBirimFiyat(this.elektrikTüketimi);
        this.aylikFatura = this.elektrikTüketimi * this.birimFiyati;

    }
    private double belirleBirimFiyat(int tüketim){
        if (tüketim >= 0 && tüketim <= 100) {
            return 1.1;
        } else if (tüketim <= 200) {
            return 1.3;
        } else if (tüketim <= 300) {
            return 1.5;
        } else if (tüketim <= 400) {
            return 1.7;
        } else if (tüketim <= 500) {
            return 1.9;
        } else {
            return 2.3;
        }
    }

    public float getAylikFatura() {
        return aylikFatura;
    }

    public int getElektrikTüketimi() {
        return elektrikTüketimi;
    }

    public float getBirimFiyati() {
        return birimFiyati;
    }
}
