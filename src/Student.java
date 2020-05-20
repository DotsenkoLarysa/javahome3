import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private int IDStudent;
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birthday;
    private String gender;

    private String citizenship;
    private String nationality;
    private String religion;
    private String Passport;
    private String BirthCertificate;

    private String phone;
    private String country;
    private String city;
    private String address;
    private String email;
    private String socialNetworks;

    private int identificationCode;
    private String bankcardNumber;
    private String issuingBank;
    private String formPaymentTraining;
    private double financialDebt;

    private MaritalStatus maritalStatus;
    private int hasChildren;

    private FamilyStatus familyStatus;
    private boolean disability;
    private String privilege;

    private BloodType bloodType;
    private boolean isBloodDonor;
    private String allergens;

    private boolean isAthlete;
    private String kindOfSport;
    private String sportsCategory;

    private boolean isDriverLicense;
    private boolean isBoundMilitaryService;

    private String knowledgeForeignLanguages;
    private boolean isPlayingMusicalInstruments;
    private String playingMusicalInstruments;
    private String hobbies;

    private Offences offences;

    private String certificateMaturity;
    private double GPA_Admission;

    private LocalDate startDate;
    private String group;
    private String department;
    private String formTraining;
    private String studySubjectChoose;
    private double GPA_Current;

    private boolean isResidenceDormitory;
    private int libraryCardNumber;

    public Student() { }

    public Student(int IDStudent, String firstName, String lastName, String patronymic, LocalDate birthday,
                   String gender, String citizenship, String nationality, String religion, String passport,
                   String birthCertificate, String phone, String country, String city, String address, String email,
                   String socialNetworks, int identificationCode, String bankcardNumber, String issuingBank,
                   String formPaymentTraining, double financialDebt, MaritalStatus maritalStatus, int hasChildren,
                   FamilyStatus familyStatus, boolean disability, String privilege, BloodType bloodType,
                   boolean isBloodDonor, String allergens, boolean isAthlete, String kindOfSport, String sportsCategory,
                   boolean isDriverLicense, boolean isBoundMilitaryService, String knowledgeForeignLanguages,
                   boolean isPlayingMusicalInstruments, String playingMusicalInstruments, String hobbies,
                   Offences offences, String certificateMaturity, double GPA_Admission, LocalDate startDate,
                   String group, String department, String formTraining, String studySubjectChoose, double GPA_Current,
                   boolean isResidenceDormitory, int libraryCardNumber) {
        this.IDStudent = IDStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.gender = gender;
        this.citizenship = citizenship;
        this.nationality = nationality;
        this.religion = religion;
        Passport = passport;
        BirthCertificate = birthCertificate;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.address = address;
        this.email = email;
        this.socialNetworks = socialNetworks;
        this.identificationCode = identificationCode;
        this.bankcardNumber = bankcardNumber;
        this.issuingBank = issuingBank;
        this.formPaymentTraining = formPaymentTraining;
        this.financialDebt = financialDebt;
        this.maritalStatus = maritalStatus;
        this.hasChildren = hasChildren;
        this.familyStatus = familyStatus;
        this.disability = disability;
        this.privilege = privilege;
        this.bloodType = bloodType;
        this.isBloodDonor = isBloodDonor;
        this.allergens = allergens;
        this.isAthlete = isAthlete;
        this.kindOfSport = kindOfSport;
        this.sportsCategory = sportsCategory;
        this.isDriverLicense = isDriverLicense;
        this.isBoundMilitaryService = isBoundMilitaryService;
        this.knowledgeForeignLanguages = knowledgeForeignLanguages;
        this.isPlayingMusicalInstruments = isPlayingMusicalInstruments;
        this.playingMusicalInstruments = playingMusicalInstruments;
        this.hobbies = hobbies;
        this.offences = offences;
        this.certificateMaturity = certificateMaturity;
        this.GPA_Admission = GPA_Admission;
        this.startDate = startDate;
        this.group = group;
        this.department = department;
        this.formTraining = formTraining;
        this.studySubjectChoose = studySubjectChoose;
        this.GPA_Current = GPA_Current;
        this.isResidenceDormitory = isResidenceDormitory;
        this.libraryCardNumber = libraryCardNumber;
    }

    public int getIDStudent() {
        return IDStudent;
    }

    public void setIDStudent(int IDStudent) {
        this.IDStudent = IDStudent;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenship() { return citizenship; }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getPassport() {
        return Passport;
    }

    public void setPassport(String passport) {
        Passport = passport;
    }

    public String getBirthCertificate() {
        return BirthCertificate;
    }

    public void setBirthCertificate(String birthCertificate) {
        BirthCertificate = birthCertificate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(String socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public int getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(Integer identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getBankcardNumber() {
        return bankcardNumber;
    }

    public void setBankcardNumber(String bankcardNumber) {
        this.bankcardNumber = bankcardNumber;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public String getFormPaymentTraining() {
        return formPaymentTraining;
    }

    public void setFormPaymentTraining(String formPaymentTraining) {
        this.formPaymentTraining = formPaymentTraining;
    }

    public double getFinancialDebt() {
        return financialDebt;
    }

    public void setFinancialDebt(double financialDebt) {
        this.financialDebt = financialDebt;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(int hasChildren) {
        this.hasChildren = hasChildren;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
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

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public boolean getBloodDonor() {
        return isBloodDonor;
    }

    public void setBloodDonor(boolean bloodDonor) {
        isBloodDonor = bloodDonor;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public boolean getAthlete() {
        return isAthlete;
    }

    public void setAthlete(boolean athlete) {
        isAthlete = athlete;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String getSportsCategory() {
        return sportsCategory;
    }

    public void setSportsCategory(String sportsCategory) {
        this.sportsCategory = sportsCategory;
    }

    public boolean getDriverLicense() {
        return isDriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        isDriverLicense = driverLicense;
    }

    public boolean getBoundMilitaryService() {
        return isBoundMilitaryService;
    }

    public void setBoundMilitaryService(boolean boundMilitaryService) {
        isBoundMilitaryService = boundMilitaryService;
    }

    public String getKnowledgeForeignLanguages() {
        return knowledgeForeignLanguages;
    }

    public void setKnowledgeForeignLanguages(String knowledgeForeignLanguages) {
        this.knowledgeForeignLanguages = knowledgeForeignLanguages;
    }

    public boolean getPlayingMusicalInstruments() {
        return isPlayingMusicalInstruments;
    }

    public void setPlayingMusicalInstruments(String playingMusicalInstruments) {
        this.playingMusicalInstruments = playingMusicalInstruments;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Offences getOffences() {
        return offences;
    }

    public void setOffences(Offences offences) {
        this.offences = offences;
    }

    public String getCertificateMaturity() {
        return certificateMaturity;
    }

    public void setCertificateMaturity(String certificateMaturity) {
        this.certificateMaturity = certificateMaturity;
    }

    public double getGPA_Admission() {
        return GPA_Admission;
    }

    public void setGPA_Admission(double GPA_Admission) {
        this.GPA_Admission = GPA_Admission;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFormTraining() {
        return formTraining;
    }

    public void setFormTraining(String formTraining) {
        this.formTraining = formTraining;
    }

    public String getStudySubjectChoose() {
        return studySubjectChoose;
    }

    public void setStudySubjectChoose(String studySubjectChoose) {
        this.studySubjectChoose = studySubjectChoose;
    }

    public double getGPA_Current() {
        return GPA_Current;
    }

    public void setGPA_Current(double GPA_Current) {
        this.GPA_Current = GPA_Current;
    }

    public boolean getResidenceDormitory() {
        return isResidenceDormitory;
    }

    public void setResidenceDormitory(boolean residenceDormitory) {
        isResidenceDormitory = residenceDormitory;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public void setPlayingMusicalInstruments(boolean playingMusicalInstruments) {
        isPlayingMusicalInstruments = playingMusicalInstruments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDStudent=" + IDStudent +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", nationality='" + nationality + '\'' +
                ", religion='" + religion + '\'' +
                ", Passport='" + Passport + '\'' +
                ", BirthCertificate='" + BirthCertificate + '\'' +
                ", phone=" + phone +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", socialNetworks='" + socialNetworks + '\'' +
                ", identificationCode=" + identificationCode +
                ", bankcardNumber=" + bankcardNumber +
                ", issuingBank='" + issuingBank + '\'' +
                ", formPaymentTraining='" + formPaymentTraining + '\'' +
                ", financialDebt=" + financialDebt +
                ", maritalStatus=" + maritalStatus +
                ", hasChildren=" + hasChildren +
                ", familyStatus=" + familyStatus +
                ", disability=" + disability +
                ", privilege='" + privilege + '\'' +
                ", bloodType=" + bloodType +
                ", isBloodDonor=" + isBloodDonor +
                ", allergens='" + allergens + '\'' +
                ", isAthlete=" + isAthlete +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", sportsCategory='" + sportsCategory + '\'' +
                ", isDriverLicense=" + isDriverLicense +
                ", isBoundMilitaryService=" + isBoundMilitaryService +
                ", knowledgeForeignLanguages='" + knowledgeForeignLanguages + '\'' +
                ", isPlayingMusicalInstruments=" + isPlayingMusicalInstruments +
                ", playingMusicalInstruments='" + playingMusicalInstruments + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", offences=" + offences +
                ", certificateMaturity='" + certificateMaturity + '\'' +
                ", GPA_Admission=" + GPA_Admission +
                ", startDate=" + startDate +
                ", group='" + group + '\'' +
                ", department='" + department + '\'' +
                ", formTraining='" + formTraining + '\'' +
                ", studySubjectChoose='" + studySubjectChoose + '\'' +
                ", GPA_Current=" + GPA_Current +
                ", isResidenceDormitory=" + isResidenceDormitory +
                ", libraryCardNumber=" + libraryCardNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return IDStudent == student.IDStudent &&
                identificationCode == student.identificationCode &&
                bankcardNumber == student.bankcardNumber &&
                Double.compare(student.financialDebt, financialDebt) == 0 &&
                hasChildren == student.hasChildren &&
                disability == student.disability &&
                isBloodDonor == student.isBloodDonor &&
                isAthlete == student.isAthlete &&
                isDriverLicense == student.isDriverLicense &&
                isBoundMilitaryService == student.isBoundMilitaryService &&
                isPlayingMusicalInstruments == student.isPlayingMusicalInstruments &&
                Double.compare(student.GPA_Admission, GPA_Admission) == 0 &&
                Double.compare(student.GPA_Current, GPA_Current) == 0 &&
                isResidenceDormitory == student.isResidenceDormitory &&
                libraryCardNumber == student.libraryCardNumber &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                patronymic.equals(student.patronymic) &&
                birthday.equals(student.birthday) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(citizenship, student.citizenship) &&
                Objects.equals(nationality, student.nationality) &&
                Objects.equals(religion, student.religion) &&
                Objects.equals(Passport, student.Passport) &&
                Objects.equals(BirthCertificate, student.BirthCertificate) &&
                Objects.equals(phone, student.phone) &&
                Objects.equals(country, student.country) &&
                Objects.equals(city, student.city) &&
                Objects.equals(address, student.address) &&
                Objects.equals(email, student.email) &&
                Objects.equals(socialNetworks, student.socialNetworks) &&
                Objects.equals(issuingBank, student.issuingBank) &&
                Objects.equals(formPaymentTraining, student.formPaymentTraining) &&
                maritalStatus == student.maritalStatus &&
                familyStatus == student.familyStatus &&
                Objects.equals(privilege, student.privilege) &&
                bloodType == student.bloodType &&
                Objects.equals(allergens, student.allergens) &&
                Objects.equals(kindOfSport, student.kindOfSport) &&
                Objects.equals(sportsCategory, student.sportsCategory) &&
                Objects.equals(knowledgeForeignLanguages, student.knowledgeForeignLanguages) &&
                Objects.equals(playingMusicalInstruments, student.playingMusicalInstruments) &&
                Objects.equals(hobbies, student.hobbies) &&
                offences == student.offences &&
                Objects.equals(certificateMaturity, student.certificateMaturity) &&
                Objects.equals(startDate, student.startDate) &&
                Objects.equals(group, student.group) &&
                Objects.equals(department, student.department) &&
                Objects.equals(formTraining, student.formTraining) &&
                Objects.equals(studySubjectChoose, student.studySubjectChoose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDStudent, firstName, lastName, patronymic, birthday, gender, citizenship,
                nationality, religion, Passport, BirthCertificate, phone, country, city, address, email,
                socialNetworks, identificationCode, bankcardNumber, issuingBank, formPaymentTraining,
                financialDebt, maritalStatus, hasChildren, familyStatus, disability, privilege, bloodType,
                isBloodDonor, allergens, isAthlete, kindOfSport, sportsCategory, isDriverLicense,
                isBoundMilitaryService, knowledgeForeignLanguages, isPlayingMusicalInstruments,
                playingMusicalInstruments, hobbies, offences, certificateMaturity, GPA_Admission, startDate,
                group, department, formTraining, studySubjectChoose, GPA_Current, isResidenceDormitory,
                libraryCardNumber);
    }

    public Boolean isAdult(){
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(getBirthday()));
        LocalDate localDate = LocalDate.now();
        int d2 = Integer.parseInt(formatter.format(localDate));
        int age = (d2 - d1)/10000;
        if(age>=18)return true;
        else return false;
    }
}
