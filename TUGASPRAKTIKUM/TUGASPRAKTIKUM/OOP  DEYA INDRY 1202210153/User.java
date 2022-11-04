import javax.sound.sampled.SourceDataLine;

public class User {
string name;
string phoneNumber;
public void setMenu(String name) {
    this.name = name;
}
public void setCategory(String phoneNumber){
    this.phoneNumber = phoneNumber;
}
    public void register(){
        System.out.println("Masukkan nama anda: "+this.name);
        System.out.println("Masukkan nama anda: "+this.phoneNumber);
        System.out.println("Selamat anda telah berhasil melakukan register");
    }
    


}
