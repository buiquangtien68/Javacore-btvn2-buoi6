public class Doctor extends Person{
    private String specialty;
    private double workingHour;

    public Doctor(String name, int age, String specialty, double workingHour) {
        super(name, age);
        this.specialty = specialty;
        this.workingHour = workingHour;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + specialty + '\'' +
                ", workingHour=" + workingHour +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
