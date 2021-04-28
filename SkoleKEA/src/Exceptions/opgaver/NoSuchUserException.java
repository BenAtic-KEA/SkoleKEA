package Exceptions.opgaver;

import java.lang.invoke.WrongMethodTypeException;

public class NoSuchUserException extends RuntimeException{

    NoSuchUserException(){
        super("Wrong CPR");
    }
}
