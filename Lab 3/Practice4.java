import java.util.*;

class Practice4 {
        public static void main(String args[]) {
            int marks[][] = {{101,103,105,106,109}, {67,70,43,89,56}};
            int id, ch;
            Scanner sc = new Scanner(System.in);
            while (true) {
                
                System.out.println("Options:    1.Search     2.Delete     3.Insert    4.Display    5.Quit");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();
                boolean present = false; 
                
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
                        System.out.print("Enter student's ID Number to delete: ");
                        id = sc.nextInt();  
                        for (int i=0; i<marks[0].length; i++) {
                            if (id == marks[0][i]) {
                                present = true;
                                marks[0][i] = -1;
                                marks[1][i] = -1;                               
                            }
                        }
                        if (present==false) 
                            System.out.println("Entered ID doesn't exist.");    
                        break;
                        
                    case 3:
                        System.out.print("Enter index to insert at: ");
                        int index = sc.nextInt();
                        if (marks[0][index] == -1) {
                            System.out.print("Enter ID No.: ");
                            marks[0][index] = sc.nextInt();
                            System.out.print("Enter marks: ");
                            marks[1][index] = sc.nextInt();
                        }   
                        else 
                            System.out.println("Location is not empty.");
                        break;
                            
                    case 4:
                        for (int i=0; i<marks[0].length; i++)
                            System.out.println("ID: " + marks[0][i] + " Has marks: " + marks[1][i]); 
                        break;              
                    
                    case 5:
                        System.out.println("Exiting");
                        break;                           
            }
            sc.close();
        }
    }
}
