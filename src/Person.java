import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String gender;
    private LocalDate birthday;

    public Person() { }

    public Person(String firstName, String lastName, String patronymic, String gender, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.gender = gender;
        this.birthday = birthday;
    }

    public boolean isAdult(){
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(getBirthday()));
        LocalDate localDate = LocalDate.now();
        int d2 = Integer.parseInt(formatter.format(localDate));
        int age = (d2 - d1)/10000;
        if(age>=18)return true;
        else return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }



}
