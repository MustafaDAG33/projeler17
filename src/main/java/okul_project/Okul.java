package okul_project;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    String okulunAdi;
    int maksimumOgrenciSayisi;

     List<Ogrenci> list = new ArrayList<>();

    public Okul(String okulunAdi, int maksimumOgrenciSayisi) {
        this.okulunAdi = okulunAdi;
        this.maksimumOgrenciSayisi = maksimumOgrenciSayisi;
    }



    @Override
    public String toString() {
        return "Okul{" +
                "okulunAdi='" + okulunAdi + '\'' +
                ", maksimumOgrenciSayisi=" + maksimumOgrenciSayisi +
                ", list=" + list +
                '}';
    }
}
