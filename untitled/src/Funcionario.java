import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{

    private BigDecimal salary;
    private String occupation;

    public Funcionario(String name, LocalDate birthDate, BigDecimal salary, String occupation) {
        super(name, birthDate);
        this.salary = salary;
        this.occupation = occupation;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setSalary(BigDecimal newSalary) {
        this.salary = newSalary;
    }
}

