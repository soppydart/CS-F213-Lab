import java.util.*;

class Practice4 {
        public static void main(String args[]) {
            int marks[][] = {{101,103,105,106,109}, {67,70,43,89,56}};
            int id, ch;
            boolean breakLoop = false;
            Scanner sc = new Scanner(System.in);
            while (true) {
              	
                boolean present = false; 
              	if(breakLoop)
              	break;
                System.out.println("Options:    1.Search     2.Display    3.Quit");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();
                
                switch (ch) {
                
                    case 1:                                           
                        System.out.print("Enter student's ID Number to search for: ");
                        id = sc.nextInt();                   
                        for (int i=0; i<marks[0].length; i++) {
                            if (id == marks[0][i]) {
                                System.out.println("Marks of Student with ID " + id + " = " + marks[1][i]);
                                present = true;
                                break;
                            }
                        }                   
                        if (present==false)
                            System.out.println("Invalid input!");
                        break;
                    case 2:
                        for (int i=0; i<marks[0].length; i++)
                            System.out.println("ID: " + marks[0][i] + " Has marks: " + marks[1][i]); 
                        break;              
                    
                    case 3:
                        System.out.println("Exiting");
                        breakLoop = true;
                        break;                           
            }
        }
    }
}
