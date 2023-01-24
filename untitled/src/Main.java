import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Henrique", LocalDate.of(1992, 04, 02), new BigDecimal("1500.50"), "Desenvolvedor");
        System.out.println(func1.getNome());
    }
}