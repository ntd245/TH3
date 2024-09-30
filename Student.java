public class Student {
    String name; // thuộc tính name
    String MSSV;
    String dateOfBirth;
    // phương thức khởi tạo không tham số
    public Student() {
    }

    // phương thức khởi tạo 1 tham số (name)
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}