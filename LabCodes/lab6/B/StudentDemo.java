package LabCodes.lab6.B;

public class StudentDemo {
    public static void main(String[] args) {
    Student printInfo = new Student();
    ConstructStudent constructed = new ConstructStudent(14, 10);

    printInfo.printStudentInfo();
    //I did not get any errors. The printed outputs were 0 because it auto constructs for us and the number it gives is 0.
    constructed.printStudentInfo();

    }
}
