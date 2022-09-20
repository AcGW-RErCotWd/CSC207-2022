import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person x = new Person("person 1");
        System.out.println(x.getName());
        Student y = new Student("1234567890", "student 2");
        System.out.println(y.getName() + " " + y.getStudentNumber());

        Person z = new Student("1111111111", "person 3");
        System.out.println(((Student)z).getStudentNumber());

        ArrayList<Person> ListOfPerson = new ArrayList<>();
        ListOfPerson.add(x);
        ListOfPerson.add(y);
        ListOfPerson.add(z);
        for (int counter = 0; counter < ListOfPerson.size(); counter++) {
            System.out.println(ListOfPerson.get(counter).getName());
        }
    }
}