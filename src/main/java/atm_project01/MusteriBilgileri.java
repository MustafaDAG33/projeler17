package atm_project01;

public class MusteriBilgileri {

    private String ad;
    private String kartNo;
    private String sifre;
    private double bakiye;


    public MusteriBilgileri(String ad, String kartNo, String sifre, double bakiye) {
        this.ad = ad;
        this.kartNo = kartNo;
        this.sifre = sifre;
        this.bakiye=bakiye;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }



    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye=bakiye;
    }



    @Override
    public String toString() {
        return "MusteriBilgileri{" +
                "ad='" + ad + '\'' +
                ", kartNo='" + kartNo + '\'' +
                ", sifre='" + sifre + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }
}
