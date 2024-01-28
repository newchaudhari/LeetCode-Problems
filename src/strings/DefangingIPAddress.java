package strings;

//https://leetcode.com/problems/defanging-an-ip-address/description/?envType=list&envId=pi8tk6d3
public class DefangingIPAddress {
    public static void main(String[] args) {
        String string = "1.1.1.1";
        System.out.println(defangIPaddr(string));

    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
