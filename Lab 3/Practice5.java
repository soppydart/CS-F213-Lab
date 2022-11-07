class Student {

    int id, age; int marks[] = {0,0,0}; String name; 
    
    Student (int x, String y, int z) {
        id=x;    
        name=y;
        age=z;
    }
    
    void setMarks(int a, int b, int c) {
        marks[0] = a; marks[1] = b; marks[2] = c;
    }
    
    void studentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        for (int i=0; i<marks.length; i++)
            System.out.println("Marks in subject " + (i+1) + ": " + marks[i]);
        System.out.println();
    }
}

class Practice5 {
    public static void main(String args[]) {
    
        Student s1 = new Student(105,"Raj",21);
        s1.setMarks(67,90,65);
        
        Student s2 = new Student(109,"Gopal",23);
        s2.setMarks(70,75,55);
        
        s1.studentDetails();
        s2.studentDetails();
    }
}
