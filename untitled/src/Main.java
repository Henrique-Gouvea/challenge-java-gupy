import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Principal princ = new Principal();
        System.out.println(princ.getFuncionarios());
        List<Funcionario> newList = princ.removeFuncionario("joao");
        System.out.println(newList);

    }
}