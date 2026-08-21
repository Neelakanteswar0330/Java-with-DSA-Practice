class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber);
    }
}

public class Classes_Objects {
    public static void main(String[] args) {
        Student s1 = new Student("Nishanth Nandan Reddy", 101);
        Student s2 = new Student("Neelakanteswar Reddy", 102);
        s1.display();
        s2.display();
    }
}