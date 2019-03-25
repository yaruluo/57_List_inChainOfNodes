/**
 Test list (recursive) features.
renamed UserOfListt because i kept gettign 
error: class found on application class path: UserOfList
and got really annoyed. will fix later.
 */
public class UserOfListt_recursive  {
    public static void main( String[] args ) {
        List_inChainOfNodes_recursive  list = new List_inChainOfNodes_recursive ();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
    }
}
