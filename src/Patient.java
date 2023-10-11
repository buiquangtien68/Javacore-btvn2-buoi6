import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient extends Person{
    private int id;
    private String inputDate;

    public Patient(String name, int age, int id, String inputDate) {
        super(name, age);
        this.id = id;
        this.inputDate = inputDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", inputDate=" + inputDate +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
