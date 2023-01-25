import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

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
}
