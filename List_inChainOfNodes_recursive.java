/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursive{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_recursive(){
    }

    public List_inChainOfNodes_recursive( Node headReference) {
	this.headReference = headReference;
    }
     

    /**
      @return the number of elements in this list
     */
    public int size() {
	if( headReference == null) // base case
	    return 0;
	return 1
	    +
	    new List_inChainOfNodes_recursive(
		      headReference.getReferenceToNextNode()
					     )   .size();
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString(){
	String output = new String();

	output = toStringHelper();
	
	return "[" + output + "]";
    }

    public String toStringHelper(){
	String output = new String();
    	if( size() == 0)
	    return "";
	output += headReference.getCargoReference() + ","
	    + new List_inChainOfNodes_recursive(headReference.getReferenceToNextNode()).toStringHelper();

	return output;
    }
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 Node lastReference = headReference;
	 headReference = new Node( val, lastReference);
        return true;
     }
}
