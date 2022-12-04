public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("data", 2, 1.80F);
        perangkat.informasi();
        System.out.println("\n");
        Laptop laptop = new Laptop("Seagate", 8, 2.40F, true);
        laptop.informasi();

        laptop.bukaGame("valorant \n");
        laptop.kirimEmail("its.rubyjanne@gmail.com \n");
        laptop.kirimEmail("rubyjanenie@gmail.com", "rubyjanejennie@gmail.com");
        System.out.println("\n");

        Handphone handphone = new Handphone("Sandisk", 3 , 2.20F, false);
        handphone.informasi();
        handphone.telfon(628392484);
        handphone.kirimSMS(628464665);
        handphone.kirimSMS(628210938, 628350243);
    }
}