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
	    output += refToNode.getCargoReference() + ",";
	    refToNode = refToNode.getReferenceToNextNode();
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

    public Object get( int index){
	Node currentNode = headReference;
	for( int el = 0; el < index; el ++){
	    currentNode = currentNode.getReferenceToNextNode();
	}
	return currentNode.getCargoReference();
    }

    public void set( int index, Object value){
	Node currentNode = headReference;
        for( int el = 0; el < index; el ++){
	    currentNode = currentNode.getReferenceToNextNode();
	}
	currentNode.setCargoReference(val);
    }

    public boolean add( int index, Object val){
	Node currentNode = headReference;
	for( int el = 0; el < index-1; index++)
	    currentNode = currentNode.getReferenceToNextNode();
	Node newNode = new Node( val, currentNode.getReferenceToNextNode());
        currentNode.setReferenceToNextNode( newNode);
        return true;
    }

    public boolean remove( int index){
	Node currentNode = headReference;
        for( int el = 0; el < index - 1; el++) {
            currentNode = currentNode.getReferenceToNextNode();
        }
        currentNode.setReferenceToNextNode( currentNode.getReferenceToNextNode());
        return true;
    }
	



    
}
