package com.cleverdevices.interview.codetest.stack;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by brian on 6/8/17.
 */
public class HufStack<T> {

    final LinkedList<T> elements;

    /**
     * Primary Constructor.
     * Constructs an empty stack.
     **/

     public HufStack(){
        elements = new LinkedList<T>();
     }

    /**
     * May pass any number of elements to be added to the stack.
     * The elements will be in the stack from top to bottom in the order given.
     *
     * @param elementsToAdd an argument list of elements to add to the stack.
     */
    public HufStack(T... elementsToAdd){
        elements = new LinkedList<T>();

        for (int i=0; i < elementsToAdd.length; i++){
            elements.addLast(elementsToAdd[i]);
        }
    }

    /**
     * Copy constructor makes a shallow copy of the elements in another HufStack
     * @param hufStack
     */
    public HufStack(HufStack<T> hufStack) {
        elements = new LinkedList<T>();
        elements.addAll(hufStack.getElements());
    }

    /**
     * Add an element to the top of the stack.
     * @param element to be added
     */
    public synchronized void push(T element){ elements.addFirst( element ); }

    /**
     * Remove and return the element on the top
     * of the stack.
     *
     * @return The element on the top of the stack.
     * @throws HufStackEmptyException if the stack is empty.
     */
    public synchronized T pop() {

        if(isEmpty()) throw new HufStackEmptyException("Requested pop on empty stack");

        return elements.removeFirst();
    }

    /**
     * @return The number of elements in the stack.
     */
    public synchronized int size(){ return elements.size(); }


    /**
     * @return True if the stack is empty and False otherwise.
     */
    public synchronized boolean isEmpty() { return elements.isEmpty(); }

    /**
     * Get but do not remove the element on the top of the stack.
     * @return The element on the top of the stack.
     */
    public synchronized T peek(){

        if( this.isEmpty() ) throw new HufStackEmptyException("Requested Peek on empty stack.");

        return elements.getFirst();
    }

    /**
     * Returns true if the requested element exists inside this stack.
     * @param element The element to look for.
     * @return True if the element is in the stack, and false otherwise.
     */
    public synchronized boolean contains(T element){ return this.elements.contains(element); }

    /*
    * This is a private method that is only used internally for copying elements from another hufstack.
    */
    private LinkedList<T> getElements(){
        return this.elements;
    }

    /**
     * Explicitely defined the hashcode function, but this is inherited from Object.
     * @return the hashcode for this object represented by its unique address.
     */
    public synchronized int hashCode(){
        return super.hashCode();
    }


    /**
     * If this HufStack is equal to the provided Hufstack then return true.
     * This function will test on length of list, and the equivelence of all elements
     * In the same order. This means that [A, B, C] is no equal to [B, A, C]
     *
     * @param otherStack The stack to compare this stack to.
     * @return True only if the length, order of elements, and the elements themselves are equal.
     */
    public synchronized boolean equals(HufStack otherStack){

        // This comment shows the logic used for this comparison, but the best method
        // is to use the existing code, written for the java architecture.

        //        if(otherStack == null || this.size() != otherStack.size() ){
        //            return false;
        //        }
        //
        //        for(T element : this.elements ){
        //
        //            if ( ! otherStack.contains( element ) )
        //                return false;
        //        }

        return this.elements.equals( otherStack.getElements() );
    }

    /**
     * @return The string representation of this stack.
     */
    public synchronized String toString(){
        StringBuilder thisAsString = new StringBuilder("[");

        if( ! this.elements.isEmpty()) {

            //Append the toString value of each element to the string followed by a ', '
            this.elements.forEach(  element -> { thisAsString.append(element).append(", "); });

            //remove the comma at the end.
            thisAsString.delete(thisAsString.length() - 2, thisAsString.length());
        }
        thisAsString.append("]");

        return thisAsString.toString();
    }

}
