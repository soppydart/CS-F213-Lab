// Logical Operators Demo

class Practice2 {
    public static void main(String args[]) {
        int a=24, b=13, temp, val;
        boolean result;
        
        result = ((a>b) & (a>100));     // Logical AND              
        System.out.println("Result is " + result);      // false
        
        result = ((a>b) | (a>100));     // Logical OR
        System.out.println("Result is " + result);      // true
        
        result = ((a>b) != (a>100));    // Logical NOT
        System.out.println("Result is " + result);      // true
        
        val = (a>b)? 100:200;           // Ternary op
        System.out.println("Val is " + val);            // 100
    }
}
