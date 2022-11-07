// Operator Precedence Demo

class Practice3 {
    public static void main(String args[]) {
        int a=10, b=2, result;
        
        result = a>>b+3;
        System.out.println("Result is " + result);      // 10>>5 = 0
        
        result = (a>>b)+3;
        System.out.println("Result is " + result);      // 2+3 = 5
        
        result = a/5*4;
        System.out.println("Result is " + result);      // 2*4 = 8
        
        result = a*4/8;
        System.out.println("Result is " + result);      // 40/8 = 5
    }
} 
