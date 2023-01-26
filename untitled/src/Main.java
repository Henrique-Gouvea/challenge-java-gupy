import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        Req 1 e 2 Classes Funcionario e Pessoa

//        Req 3 e 3.1
        Principal princ = new Principal();

//        Req 3.2
        princ.removeEmploye("Joao");

//        Req 3.3
        princ.printEmployess();

//        Req 3.4
        princ.salaryIncrease(10.0);

//        Req 3.5 Helpers.groupEmployessForOcupatio

//        Req 3.6
        princ.printEmployessForOcupatio();

//        Req 3.8
        princ.printEmployessBirthMonth(10);
        princ.printEmployessBirthMonth(12);

//        Req 3.9
        princ.printEmployeOlder();

//        Req 3.10
        princ.printEmployessOrderAlphabetic();

//        Req 3.11
        princ.totalSalary();

//        Req 3.12
        princ.getQuantitySalaryMinForEmployee(new BigDecimal(1212));

    }
}