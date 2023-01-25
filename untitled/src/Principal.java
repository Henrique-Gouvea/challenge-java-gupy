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
        Funcionario func1 = new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador");
        Funcionario func2 = new Funcionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador");
        Funcionario func3 = new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador");
        Funcionario func4 = new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor");
        Funcionario func5 = new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista");
        Funcionario func6 = new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador");
        Funcionario func7 = new Funcionario("Arthur", LocalDate.of(1992, 3, 31), new BigDecimal("4071.84"), "Contador");
        Funcionario func8 = new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente");
        Funcionario func9 = new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista");
        Funcionario func10 = new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente");
        this.employess.add(func1);
        this.employess.add(func2);
        this.employess.add(func3);
        this.employess.add(func4);
        this.employess.add(func5);
        this.employess.add(func6);
        this.employess.add(func7);
        this.employess.add(func8);
        this.employess.add(func9);
        this.employess.add(func10);
    }
    public List<Funcionario> getFuncionarios(){
        return this.employess;
    }

    public List<Funcionario> removeEmploye(String funcionarioRemove){
        Iterator<Funcionario> iterator = this.employess.iterator();
        while(iterator.hasNext()){
            Funcionario funcionario = iterator.next();
            if(funcionario.getNome().equals(funcionarioRemove)) {
                iterator.remove();
            }
        }
        return this.employess;
    }

    public void printEmployess(){
        Iterator<Funcionario> iterator = this.employess.iterator();

        System.out.println("---------------Funcionarios---------------");
        while(iterator.hasNext()){
            Funcionario funcionario = iterator.next();
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Data Nascimento: " + helpers.convertDataFormatBR(funcionario.getDataNascimento()));
            System.out.println("Salario: " + funcionario.getSalario());
            System.out.println("Funcao: " + funcionario.getFuncao());
            System.out.println("------------------------------------------");
        }
    }
}
