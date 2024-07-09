import java.util.Scanner;

class CanBo {
    String fullname;
    String birthday;
    String gender;
    String address;

    public CanBo() {

    }

    public CanBo(String fullname, String birthday, String gender, String address) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println(this);
    }

    public String toString() {
        return "Name: " + fullname + ", Birthday: " + birthday + ", Gender" + gender + ", Address" + address;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        fullname = sc.nextLine();

        System.out.println("Nhap ngay sinh: ");
        birthday = sc.nextLine();

        System.out.println("Nhap gioi tinh: ");
        gender = sc.nextLine();

        System.out.println("Nhap dia chi: ");
        address = sc.nextLine();

    }

    
}