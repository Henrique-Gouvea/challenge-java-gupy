import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Helpers {

    public String convertDataFormatBR(LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateFormated = data.format(formatter);
        return dateFormated;
    }

    public String convertNumberForSalaryBr(Number salary){
        String salaryFormated = NumberFormat.getCurrencyInstance().format(salary);
        return salaryFormated;
    }

    public Integer calculateAge(LocalDate birthDate){
        LocalDate nowDate = LocalDate.now();
        Period age = Period.between(birthDate, nowDate);
        return age.getYears();
    }

    public BigDecimal calculateQuantityMinSalary(BigDecimal salary, BigDecimal minSalary){
        BigDecimal quantitySalary = salary.divide(minSalary, 2, RoundingMode.HALF_EVEN);
        return quantitySalary;
    }

    public Map groupEmployessForOcupatio(){
        Iterator<Funcionario> iterator = new Principal().getEmployess().iterator();
        Map<String, List<Funcionario>> employessForOccupation = new HashMap<>();
        while (iterator.hasNext()){
            String occupation = iterator.next().getOccupation();
            if(!employessForOccupation.containsKey(occupation)){
                employessForOccupation.put(occupation,new ArrayList<>());
            }
            employessForOccupation.get(occupation).add(iterator.next());
        }
        return employessForOccupation;
    }
}
