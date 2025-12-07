package LabCodes.lab6.B;
public class ConstructStudent {
    public int name;
    public int age;
    public ConstructStudent (int a, int b) {
        name = a;
        age = b;
    }


    public void printStudentInfo (){
        System.out.println("Name: " + name+ " Age: " + age);
    }
}