/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *  override to use custom exceptions
 * @author sendres1
 */
public class IllegalStringLenghtException extends
        IllegalArgumentException{
    
    // has to be static for the super class
    private static final String msg = "Input length invalid";

    public IllegalStringLenghtException() {
        super(msg);
    }

    public IllegalStringLenghtException(String s) {
        super(msg);
    }

    public IllegalStringLenghtException(String message, Throwable cause) {
        super(msg, cause);
    }

    public IllegalStringLenghtException(Throwable cause) {
        super(cause);
    }
    
    
    
}
