public class ExeptionName extends Throwable{
    private String name = "Вы ввели пустое имя";

    @Override
    public String toString() {
        return name;
    }
}
