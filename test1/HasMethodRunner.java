class HasMethod
{
        void printHello()
        {
                System.out.println( "Hello world!" );
        }
}

class HasMethodRunner
{
        public static void main( String[] args )
        {
                HasMethod ref = new HasMethod();

                ref.printHello();
        }
}

