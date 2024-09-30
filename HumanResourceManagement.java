public class HumanResourceManagement {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("John");
        st1.setMSSV("696969");
        st1.setDateOfBirth("19/05/2005");

        Lecturer lec1 = new Lecturer();
        lec1.setName("Mike");
        lec1.setDateOfBirth("33/05/2000");

        Person person1 = new Person();
        person1.setName("John");
        person1.setDateOfBirth("19/05/2000");

        System.out.println(person1.getDateOfBirth());
    }
}
