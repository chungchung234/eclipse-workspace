package fomat;



import java.util.Locale;

public class Format {
    public static String name(String next) {
        next = next.replace(" ","");
        next.toLowerCase(Locale.ROOT);
        return next;
    }
    public static String phone(String next) {
        next = next.replace(" ","");
        next = next.replace("-","");
        return next;
    }
    public static String menu(String next) {
        next = next.replace(" ","");
        return next;
    }

    public static int price(String next) {
        next = next.replace(",","");
        next = next.replace(" ", "");
        return Integer.parseInt(next);
    }

    public static int rating(String next) {
        next = next.replace(" ", "");
        return Integer.parseInt((next));
    }


}
