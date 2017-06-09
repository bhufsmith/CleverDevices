package com.cleverdevices.interview.codetest.stack;

import com.cleverdevices.interview.codetest.stack.HufStack;
import com.cleverdevices.interview.codetest.stack.HufStackEmptyException;
import org.junit.Test;

/**
 * Created by brian on 6/8/17.
 */
public class HufStackTest {


    @Test
    public void emptyConstructorTest() {
        HufStack objectStack = new HufStack();
        HufStack objectStack2 = new HufStack<>();

        assert( objectStack != objectStack2 );
        assert( objectStack.isEmpty() );
    }

    @Test
    public void testConstructWithElements(){
        String s1 = "String1";
        HufStack<String> stringStack = new HufStack<>(s1, "String2", "String3");
        assert (stringStack.size() == 3);
        assert (stringStack.peek() == s1); //purposefully checking memory address equivalence
    }

    @Test
    public void testCopyConstruct(){
        HufStack<String> stringStack = new HufStack<>("A", "B", "C", "D");
        HufStack newStack = new HufStack(stringStack);

        assert ( newStack.equals( stringStack ));
    }

    @Test
    public void testPush(){
        HufStack<Integer> integerStack = new HufStack<>();
        assert (integerStack.isEmpty() );

        integerStack.push( 1 );
        assert (integerStack.size() == 1);
    }

    @Test
    public void testPop(){
        String val = "OnlyString";
        HufStack<String> stringStack = new HufStack<>(val);

        assert ( stringStack.size() == 1 );
        assert ( stringStack.pop().equals( val ));
        assert ( stringStack.isEmpty() );
    }

    @Test(expected = HufStackEmptyException.class)
    public void testPopEmpty(){
        HufStack emptyStack = new HufStack();

        //Should throw an exception
        emptyStack.pop();
    }

    @Test(expected = HufStackEmptyException.class)
    public void testPeekEmpty(){
        HufStack emptyStack = new HufStack();

        //Should throw an exception
        emptyStack.peek();
    }

    @Test
    public void testEquals(){
        HufStack<String> stack1 = new HufStack<>("A", "B", "C");
        HufStack<String> stack2 = new HufStack<>("A", "B", "C");

        assert ( stack1.equals(stack2));
    }

    @Test
    public void testNotEqual(){
        HufStack<String> stack1 = new HufStack<>("A", "B", "C");
        HufStack<String> stack2 = new HufStack<>("A", "B", "A");
        HufStack<String> stack3 = new HufStack<>("A", "B", "C", "D");


        assert ( ! stack1.equals(stack2) );
        assert ( ! stack1.equals(stack3) );
    }


    @Test
    public void testToString(){
        HufStack<String> stringStack = new HufStack<>("A", "B", "C");
        String stackString = stringStack.toString();

        assert ( stackString.equals("[A, B, C]"));

    }

    @Test
    public void testToStringEmpty(){
        HufStack<String> stringStack = new HufStack<>();
        String stackString = stringStack.toString();

        assert ( stackString.equals("[]"));
    }
}
