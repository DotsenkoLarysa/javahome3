import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

Student student = new Student (1, "Соколов", "Андрей", "Викторович",
        LocalDate.of(2000, Month.FEBRUARY,11),
        "M", "Украина", "украинец", "Православие",
        "ВМ 123456 02.03.2017 Богунским РОМВД г.Житомир", " ", "+380670989878",
        "Украина", "Житомир", "ул.Киевская,17", "SokolovA@gmail.com", "facebook",
        123456789, "8765432109872345", "ПриватБанк", "наличная",
        0, MaritalStatus.NOT_MARRIED, 0, FamilyStatus.COMPLETE, false, " ",
        BloodType.A, false, " ", false, " ", " ", false,
        true, "английский", true, "гитара",
        "пение", Offences.NO_OFFENCES, "KK234567", 90.5,
        LocalDate.of(2017, Month.SEPTEMBER, 01),
        "PH101", "Проектирование...", "стационарная", "английский",
        85.0, false, 99887766);
        System.out.println(student.toString());

        Patient patient = new Patient ("Соколов","Андрей", "Викторович","M",
                LocalDate.of(2000, Month.FEBRUARY, 11), 11223344,
                "г.Житомир,ул.Киевская,17","+380670989878","SokolovA@gmail.com",
                "ОАО БиоМедСтекло","стеклодув",true,"ІІ группа инвалидности",
                LocalDate.of(2017,Month.SEPTEMBER,01),BloodType.AB,"орехи",
                "бронхиальная астма");
        System.out.println(patient.toString());
        System.out.println("Заболевание: " + patient.getDiseases());
    }
}
