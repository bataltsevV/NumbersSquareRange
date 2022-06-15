import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService ();
            System.out.println(" Количество чисел, подходящие под диапазон: " + service.calculate ( 100, 200));
    }
}
