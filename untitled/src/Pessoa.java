import java.time.LocalDate;

abstract class Pessoa {
    private String name;
    private LocalDate birthDate;

    public Pessoa(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}
