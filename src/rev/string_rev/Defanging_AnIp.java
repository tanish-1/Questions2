package rev.string_rev;

public class Defanging_AnIp {
    public static void main(String[] args) {
        String address = "1.1.1.1";
       String newstr =   address.replace(".","[.]");
        System.out.println(newstr);

    }
}
