class Static4 {

    public static void main(String args[]) {
        Static4 s = new Static4();
        s.add(10,20);     // to call the non-static method
    }

    public void add(int x ,int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("addition" + c);
    }
}