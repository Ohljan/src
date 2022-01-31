package day42_Exceptions;

import java.beans.FeatureDescriptor;

class FadyException extends RuntimeException{
    public FadyException(){
        super("Time for a short break");
    }
    public FadyException(String message){
       super(message);
    }
}
class NobreakException extends RuntimeException{

}
public class CustomExceptions {
    public static void main(String[] args) {
        throw new FadyException("It's time for lunch break");


        }

    }
 
