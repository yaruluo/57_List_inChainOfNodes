/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes(){
    }
     

    /**
      @return the number of elements in this list
     */
    public int size() {
	int output = 0;
	Node refToNode = headReference;
	while( refToNode != null){
	    output += 1;
	    refToNode = refToNode.getReferenceToNextNode();
	}
	return output;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	String output = "[";
	Node refToNode = headReference;
	for( int index = 0; index < size(); index++){
	    result += refToNode.getCargoReference() + ",";
	    refToNode = refToNode.getRerenceToNextNode();
	}
	output += "]";
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
