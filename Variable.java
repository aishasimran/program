public class Variable { 
    int t = 8; 
    public static void main(String[] args) { 
       Variable v = new  Variable(); 
        v.test(); 
    } 
    public void test(){ 
        int t = 3; 
        System.out.println("local t="+t); 
        System.out.println("global t="+this.t);         
    } 
} 