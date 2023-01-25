import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
    private List<Funcionario> employess;
    private Helpers helpers = new Helpers();
    public Principal() {
        this.employess = new ArrayList<>();
        Funcionario emp1 = new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador");
        Funcionario emp2 = new Funcionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador");
        Funcionario emp3 = new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador");
        Funcionario emp4 = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor");
        Funcionario emp5 = new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista");
        Funcionario emp6 = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador");
        Funcionario emp7 = new Funcionario("Arthur", LocalDate.of(1992, 3, 31), new BigDecimal("4071.84"), "Contador");
        Funcionario emp8 = new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente");
        Funcionario emp9 = new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista");
        Funcionario emp10 = new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente");
        this.employess.add(emp1);
        this.employess.add(emp2);
        this.employess.add(emp3);
        this.employess.add(emp4);
        this.employess.add(emp5);
        this.employess.add(emp6);
        this.employess.add(emp7);
        this.employess.add(emp8);
        this.employess.add(emp9);
        this.employess.add(emp10);
    }
    public List<Funcionario> getEmployess(){
        return this.employess;
    }

    public List<Funcionario> removeEmploye(String funcionarioRemove){
        Iterator<Funcionario> iterator = this.employess.iterator();
        while(iterator.hasNext()){
            Funcionario employee = iterator.next();
            if(employee.getName().equals(funcionarioRemove)) {
                iterator.remove();
            }
        }
        return this.employess;
    }

    public void printEmployess(){
        Iterator<Funcionario> iterator = this.employess.iterator();

        System.out.println("---------------Funcionarios---------------");
        while(iterator.hasNext()){
            Funcionario employee = iterator.next();
            System.out.println("Nome: " + employee.getName());
            System.out.println("Data Nascimento: " + helpers.convertDataFormatBR(employee.getBirthDate()));
            System.out.println("Salario: " + helpers.convertNumberForSalaryBr(employee.getSalary()));
            System.out.println("Funcao: " + employee.getOccupation());
            System.out.println("------------------------------------------");
        }
    }

    public void salaryIncrease(Double percentIncrease){
        Iterator<Funcionario> iterator = this.employess.iterator();
        Double percent = percentIncrease/100.0;
        while(iterator.hasNext()){
            Funcionario employee = iterator.next();
            Double salary = employee.getSalary().doubleValue();
            Double newSalary = salary + (percent * salary);
            employee.setSalary(new BigDecimal(newSalary));
        }
    }

    public void printEmployessBirthMonth(Number monthNumberSearch){
        Iterator<Funcionario> iterator = this.employess.iterator();
        System.out.println("----------Aniversariantes mês:"+monthNumberSearch+ "----------");

        while(iterator.hasNext()){
            Funcionario employee = iterator.next();
            Number monthNumber = employee.getBirthDate().getMonthValue();
            if(monthNumber.equals(monthNumberSearch)) {
                System.out.println(employee.getName());
            }
        }
    }

    public void printEmployeOlder(){
        Iterator<Funcionario> iterator = this.employess.iterator();
        System.out.println("----------Funcionario mais velho----------");

        Funcionario olderEmployee = iterator.next();

        while(iterator.hasNext()){
            Funcionario employee = iterator.next();
            if(employee.getBirthDate().isAfter(olderEmployee.getBirthDate())) {
                olderEmployee = employee;
            }
        }
        System.out.println("Nome: " + olderEmployee.getName());
        System.out.println("Idade: " + olderEmployee.getBirthDate());
    }
}
