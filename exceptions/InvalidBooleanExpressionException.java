package exceptions;

public class InvalidBooleanExpressionException extends CompileException {
    public InvalidBooleanExpressionException(String s) {
        super("Unable to parse line: " + s + " into a boolean expression");
    }
}