public class ExeptionDeleteTwo extends Exception{
    private String message = "Нельзя делить на два";

    @Override
    public String toString() {
        return message;
    }
}
