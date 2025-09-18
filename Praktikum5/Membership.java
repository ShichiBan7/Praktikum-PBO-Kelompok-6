package latihan5;

public class Membership {
    String namaMember;
    long idMember;
    int mulaiBerlangganan;
    
    public Membership(String namaMember){
        this.namaMember = namaMember + " tidak terdaftar sebagai member";
        this.idMember = 0L;
        this.mulaiBerlangganan = 0;
    }
    
    public Membership(String namaMember, long idMember, int mulaiBerlangganan){
        this.namaMember = namaMember;
        this.idMember = idMember;
        this.mulaiBerlangganan = mulaiBerlangganan;
    }
    
    public void infoMember(){
        System.out.println("Informasi Member");
        System.out.println("Nama Member          : " + this.namaMember);
        System.out.println("ID Member            : " + this.idMember);
        System.out.println("Menjadi member sejak : " + this.mulaiBerlangganan);
        System.out.println("===============================================================");
    }
    
    public void infoMember(String tier){
        System.out.println("Informasi Member");
        System.out.println("Nama Member          : " + this.namaMember);
        System.out.println("ID Member            : " + this.idMember);
        System.out.println("Menjadi member sejak : " + this.mulaiBerlangganan);
        System.out.println("Tier Member          : " + tier);
        System.out.println("===============================================================");
    }
}
