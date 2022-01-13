public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        Course[] courses = new Course[2];
        Department cs = new Department();

        cs.setId(1);
        cs.setName("Computer Science");
        cs.setBudget(20000);

        Course oop = new Course();
        oop.setId(1);
        oop.setTitle("OOP in Java");
        oop.setCrHr(4);
        oop.setDepartmentId(1);

        Course db = new Course();
        db.setId(2);
        db.setTitle("Fundamental of Database");
        db.setCrHr(3);
        db.setDepartmentId(1);

        courses[0] = oop;
        courses[1] = db;

        Student studentOne = new Student();
        studentOne.setId(1);
        studentOne.setFirstName("Abebe");
        studentOne.setLastName("Kebede");
        studentOne.setGender("Male");
        studentOne.setDepartment(cs);
        studentOne.setCourses(courses);

        Student studentTwo = new Student();
        studentTwo.setId(1);
        studentTwo.setFirstName("Azeb");
        studentTwo.setLastName("Lemma");
        studentTwo.setGender("Female");
        studentTwo.setDepartment(cs);
        studentTwo.setCourses(courses);

        students[0] = studentOne;
        students[1] = studentTwo;

        System.out.println("ID \t First Name\t Last Name\t Gender\tDepartment\tTotal Courses");
        for (int i = 0; i < 2; i++) {
            System.out.println(students[i].getId() + "\t" + students[i].getFirstName() + "\t"
                    + students[i].getLastName() + "\t" + students[i].getGender() + "\t"
                    + students[i].getDepartment().getName() + "\t" + students[i].getCourses().length);
        }

    }

}