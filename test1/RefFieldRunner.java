class RefField
{
    RefField refField;

    int data;
}

class RefFieldRunner
{
    public static void main( String[] args )
    {
        RefField ref = new RefField();

        ref.refField = new RefField();

        ref.refField.data = 100;
        System.out.println( ref.refField.data );

        ref.data = 136;
        System.out.println( ref.data );
    }
}

