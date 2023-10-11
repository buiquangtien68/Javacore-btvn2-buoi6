import java.time.LocalDate;

public class ManageHospital {
    Patient patient1=new Patient("Dương",12,1, "12/12/2010");
    Patient patient2=new Patient("Hưng",23,2,"03/04/2011");
    Patient patient3=new Patient("Dũng", 24,3,"05/06/2013");

    Doctor doctor1=new Doctor("Hải",30,"Tai-Mũi-Họng",8);
    Doctor doctor2=new Doctor("Hùng",40,"Vật lý trị liệu",6.5);
    Doctor doctor3=new Doctor("Cường", 34,"Mắt",7.5);


    @Override
    public String toString() {
        return "ManageHospital{" +"\n"+
                "patient1=" + patient1 +"\n"+
                "patient2=" + patient2 +"\n"+
                "patient3=" + patient3 +"\n"+
                "doctor1=" + doctor1 +"\n"+
                "doctor2=" + doctor2 +"\n"+
                "doctor3=" + doctor3 +
                '}';
    }
}
