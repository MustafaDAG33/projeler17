package okul_project;

public class Ogrenci {

    private String adSoyad;
    private int age;






    Ogrenci(String adSoyad, int age){
        setAdSoyad(adSoyad);
        setAge(age);

    }



    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>15){
            throw new RuntimeException("kayit icin yas siniri 15'tir.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", age=" + age +
                '}';
    }
}
