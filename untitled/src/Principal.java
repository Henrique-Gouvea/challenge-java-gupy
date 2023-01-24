import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    private List<Funcionario> funcionarios;
    public Principal() {
        this.funcionarios = new ArrayList<>();
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
        this.funcionarios.add(func1);
        this.funcionarios.add(func2);
        this.funcionarios.add(func3);
        this.funcionarios.add(func4);
        this.funcionarios.add(func5);
        this.funcionarios.add(func6);
        this.funcionarios.add(func7);
        this.funcionarios.add(func8);
        this.funcionarios.add(func9);
        this.funcionarios.add(func10);
    }
    public List<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }

    public List<Funcionario> removeFuncionario(String funcionarioRemove){
        System.out.println(funcionarioRemove);
        return this.funcionarios;
    }
}
