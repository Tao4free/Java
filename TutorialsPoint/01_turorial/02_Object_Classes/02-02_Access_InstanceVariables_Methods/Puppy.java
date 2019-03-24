public class Puppy {
    int puppyAge;
    String puppyName;

    public Puppy(String name) {
        // This constructor has one parameter, name.
        puppyName = name; 
        System.out.println("Passed Name is :" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy " + puppyName + "'s age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String []args) {
        /* Object creation */
        Puppy myPuppy = new Puppy("fellow");

        /* Call class method to set puppy's age */
        myPuppy.setAge(27);

        /* Call another class method to get puppy's age */
        myPuppy.getAge();

        /* You can access instance variable as follows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}
