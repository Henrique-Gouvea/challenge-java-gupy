import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Principal princ = new Principal();
        princ.printEmployess();
        princ.removeEmploye("Joao");
        princ.printEmployess();
        princ.salaryIncrease(10.0);
        princ.printEmployess();

    }
}