package functionalinterfaces;

import java.time.LocalTime;
import java.util.Objects;

public class SupplierExample {


    public static void main(String[] args) {
        System.out.println(composeHashcodes("Hello", "World"));
        System.out.println(composeHashcodes("Hello", "World"));

//        System.out.println(composeHashcodes2("Hello", "World"));
//        System.out.println(composeHashcodes2("Hello", null));

        System.out.println(composeHashcodes3("Hello", null));
        System.out.println(composeHashcodes3("Hello", null));
    }


    public static int composeHashcodes(Object a, Object b) {
        return a.hashCode() ^ b.hashCode();
    }

    public static String getApplicationStatus() {
        System.out.println("getApplicationsStatus");
        return "It's " + LocalTime.now();
    }

    public static int composeHashcodes2(Object a, Object b) {
        Objects.requireNonNull(a, "a may not be null! " + getApplicationStatus());
        Objects.requireNonNull(b, "b may not be null! " + getApplicationStatus());

        return a.hashCode() ^ b.hashCode();
    }

    public static int composeHashcodes3(Object a, Object b) {
        Objects.requireNonNull(a, () -> "a may not be null! " + getApplicationStatus());
        Objects.requireNonNull(b, () -> "b may not be null! " + getApplicationStatus());

        return a.hashCode() ^ b.hashCode();
    }


}
