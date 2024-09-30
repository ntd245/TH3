public class Lecturer {
    String name; // thuộc tính name
    String dateOfBirth;
    // phương thức khởi tạo không tham số
    public Lecturer() {
    }

    // phương thức khởi tạo 1 tham số (name)
    public Lecturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
