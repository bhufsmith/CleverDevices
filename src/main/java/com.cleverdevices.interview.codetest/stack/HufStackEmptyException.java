package com.cleverdevices.interview.codetest.stack;

/**
 * An Exception to be thrown when attempting to manipulate the first element
 * on a HufStack, when the HufStack is empty.
 */
public class HufStackEmptyException extends RuntimeException {

    public HufStackEmptyException(){ super(); }

    public HufStackEmptyException(String message){ super(message); }

}
