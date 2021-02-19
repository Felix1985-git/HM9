package academy.belhard;

// Проверяемое исключение
public class EmptySourceFileException extends Exception{
    public EmptySourceFileException (String message){
        super(message);
    }

}
