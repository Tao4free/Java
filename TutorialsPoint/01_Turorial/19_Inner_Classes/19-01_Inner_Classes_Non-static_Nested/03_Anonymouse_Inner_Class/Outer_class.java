class AnonymousInner {
    public void mymethod() {
        System.out.println("Initial mymethod");
    }
}

public class Outer_class {
    public static void main(String[] args) {
        System.out.println("Before override:");
        AnonymousInner inner_0 = new AnonymousInner();
        inner_0.mymethod();

        System.out.println("\nAfter override:");
        AnonymousInner inner = new AnonymousInner() {
            public void mymethod() {
                System.out.println("This is an example of anonymouse inner class");
            }
        };
        inner.mymethod();

        System.out.println("\nConfirm override:");
        AnonymousInner inner_1 = new AnonymousInner();
        inner_1.mymethod();
    }
}
