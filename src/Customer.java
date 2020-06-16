import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String name;
    private Date dateOfBirth;
    private String address;
    private String picture;
    private static final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String picture) {
        this.name = name;
        try {
            this.dateOfBirth = df.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.address = address;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
