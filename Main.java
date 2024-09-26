public class Main {
    public static void main(String[] args) throws Exception {

        Smartphone galaxy = new Smartphone("Galaxy", "S15");
        FeaturePhone nok = new FeaturePhone("Nokia", "3300");

        galaxy.nyalakan();
        galaxy.aksesInternet();
        galaxy.kirimpesan("kcinagas123@gmail.com", "Pengumpulan Nilai", "Hai");
        galaxy.kirimpesan("082338170454", "Halo");
        galaxy.matikan();
        nok.nyalakan();
        nok.mainGameSnake();
        nok.kirimpesan("082338910467", "082338170454", "Hai");
        nok.matikan();
    }
}
