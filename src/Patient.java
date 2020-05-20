import java.time.LocalDate;
import java.util.Objects;

public class Patient extends Person{

    private Person person;
    private int numberMedicineCard;
    private String address;
    private String phone;
    private String email;
    private String placeWork;
    private String occupation;
    private boolean disability;
    private String privilege;

    private LocalDate dateVisit;
    private BloodType bloodType;
    private String allergens;
    private String diseases;

    public Patient() { }

    public Patient(String firstName, String lastName, String patronymic, String gender, LocalDate birthday,
                   int numberMedicineCard, String address, String phone, String email,
                   String placeWork, String occupation, boolean disability, String privilege, LocalDate dateVisit,
                   BloodType bloodType, String allergens, String diseases) {
        super(firstName, lastName, patronymic, gender, birthday);
        this.numberMedicineCard = numberMedicineCard;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.placeWork = placeWork;
        this.occupation = occupation;
        this.disability = disability;
        this.privilege = privilege;
        this.dateVisit = dateVisit;
        this.bloodType = bloodType;
        this.allergens = allergens;
        this.diseases = diseases;
    }

    public int getNumberMedicineCard() {
        return numberMedicineCard;
    }

    public void setNumberMedicineCard(int numberMedicineCard) {
        this.numberMedicineCard = numberMedicineCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean getDisability() {
        return disability;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public LocalDate getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(LocalDate dateVisit) {
        this.dateVisit = dateVisit;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "person=" + person +
                ", numberMedicineCard=" + numberMedicineCard +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", placeWork='" + placeWork + '\'' +
                ", occupation='" + occupation + '\'' +
                ", disability=" + disability +
                ", privilege='" + privilege + '\'' +
                ", dateVisit=" + dateVisit +
                ", bloodType=" + bloodType +
                ", allergens='" + allergens + '\'' +
                ", diseases='" + diseases + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return numberMedicineCard == patient.numberMedicineCard &&
                disability == patient.disability &&
                person.equals(patient.person) &&
                Objects.equals(address, patient.address) &&
                Objects.equals(phone, patient.phone) &&
                Objects.equals(email, patient.email) &&
                Objects.equals(placeWork, patient.placeWork) &&
                Objects.equals(occupation, patient.occupation) &&
                Objects.equals(privilege, patient.privilege) &&
                Objects.equals(dateVisit, patient.dateVisit) &&
                bloodType == patient.bloodType &&
                Objects.equals(allergens, patient.allergens) &&
                Objects.equals(diseases, patient.diseases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, numberMedicineCard, address, phone, email, placeWork,
                occupation, disability, privilege, dateVisit, bloodType, allergens, diseases);
    }


}
