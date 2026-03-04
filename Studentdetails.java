public class Studentdetails {

    String studentname;
    String schoolname;
    String language;
    int age;
    int math;
    int phy;
    int chem;

    // Constructor
    Studentdetails(String studentname, String schoolname, String language,
                   int age, int math, int phy, int chem) {
        this.studentname = studentname;
        this.schoolname = schoolname;
        this.language = language;
        this.age = age;
        this.math = math;
        this.phy = phy;
        this.chem = chem;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + studentname);
        System.out.println("School Name: " + schoolname);
        System.out.println("Language: " + language);
        System.out.println("Age: " + age);
        System.out.println("Maths Mark: " + math);
        System.out.println("Physics Mark: " + phy);
        System.out.println("Chemistry Mark: " + chem);
        System.out.println();
    }
}