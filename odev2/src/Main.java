public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Ogrenci[] ogrenciler = {
                new Ogrenci("1973104001", 0.0),
                new Ogrenci("Gökhan", "Bilgisayar Müh", "1985104001", 0.0, 2023),
                new Ogrenci("Ayşe", "Makine Müh", "1985104001",0.0 , 2017),
                new Ogrenci("Elif", "Elektrik-Elektronik Müh", "2020104001", 1.98, 2018)
        };

        System.out.println("Öğrenci Bilgileri");
        for (int i = 0; i < ogrenciler.length; i++) {
            ganoCont(ogrenciler[i].getGano());
            System.out.println("OGR-" + (i+1) + " " + ogrenciler[i]);
        }
        for (int i = 1; i < ogrenciler.length; i++) {
            if (ogrenciler[i].harcHesapla()>0) {
                System.out.println(i+". Öğrencinin Ödeyeceği harc: "+ ogrenciler[i].harcHesapla());
            }

        }
    }
    public static void ganoCont (double gano) throws IllegalAccessException {
        if (gano<0 || gano>4){
            throw new IllegalAccessException("Geçerli bir gano giriniz!");
        }
    }
}