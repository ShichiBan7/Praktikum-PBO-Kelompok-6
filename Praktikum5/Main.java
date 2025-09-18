package latihan5;

public class Main {
    public static void main(String[] args) {
    Membership member1 = new Membership("Alex lee", 12345L, 2018);
    Membership member2 = new Membership("Barbiella Winston", 13751, 2012);
    Membership member3 = new Membership("Jhon Doe");
    
    member1.infoMember();
    member2.infoMember("Diamond");
    member3.infoMember();
    }
}
