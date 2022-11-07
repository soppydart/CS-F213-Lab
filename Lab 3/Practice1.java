// Bitwise Operators Demo

class Practice1 {
    public static void main(String args[]) {
        int a=25, b=13, result;                         // 25 = 11001, 13 = 01101
                
        result = a&b;   // Bitwise AND
        System.out.println("Result is " + result);      // 01001 = 9
        
        result = a^b;   // Bitwise XOR
        System.out.println("Result is " + result);      // 10100 = 20
        
        result = a|b;   // Bitwise OR
        System.out.println("Result is " + result);      // 11011 = 29
        
        result = a<<3;  // Shift left by 3
        System.out.println("Result is " + result);      // 200
        
        result = a>>3;  // Shift right by 3
        System.out.println("Result is " + result);      // 3
        
        result = ~b;    // Bitwise NOT
        System.out.println("Result is " + result);      // 10010 = -14 --> Since -ve no. it is represented in 2's complement --> -16+2 = -14
    }
}
