class Outer_Demo {
    // private variable of the outer calss
    private int num = 175;

    //inner class
    public class Inner_Demo {
        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }

    // Accessing the private variable of Outer_Demo from the method within
    void display_privateVar() {
        System.out.println("Accessing the private variable of Outer_Demo from the method within");
        System.out.println(num);
    }
}

public class My_class2 {
    public static void main(String[] args) {
        // Instantiating the outer class
        Outer_Demo outer = new Outer_Demo();
        outer.display_privateVar();

        // Instantiating the inner class
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
