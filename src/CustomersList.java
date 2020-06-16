import java.util.ArrayList;
import java.util.List;

public class CustomersList {
    private static final List<Customer> customers = new ArrayList<>();

    static {
        initData();
    }

    public static void initData() {
        customers.add(new Customer("Phu", "12/2/1992" , "Hai Phong", "https://ca.slack-edge.com/T4AQ8L79A-U01046D0Z4P-fc70eae52539-512"));
        customers.add(new Customer("Vu", "08/06/1993" , "Nam Dinh", "https://ca.slack-edge.com/T4AQ8L79A-U01020FBS4V-c9717b2ac549-512"));
        customers.add(new Customer("Hung", "1/2/1993" , "Ha Noi", "https://ca.slack-edge.com/T4AQ8L79A-UV4RVHADR-1cb7bda8bf97-512"));
        customers.add(new Customer("Dat", "30/5/1995" , "Nghe An", "https://ca.slack-edge.com/T4AQ8L79A-UVAGDF31R-2b2bad99e723-512"));
        customers.add(new Customer("Tuyen", "28/8/1989" , "Nghe An", "https://ca.slack-edge.com/T4AQ8L79A-U0102A747FS-f68a80ce0d8b-512"));
    }

    public static List<Customer> getCustomers() {
        return customers;
    }
}
