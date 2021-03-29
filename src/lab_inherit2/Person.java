/** пакет содержит классы и интерфейсы
 * для лабораторной работы
 * "Наследование и полиморфизм"
 * */
package lab_inherit2;

import java.time.LocalDate;

/**Класс Person - класс для работы с отдельной персоной
 * @author Будаева
 */
public class Person {
    /**статическое поле для хранения значения пола MALE*/
    public static final String GENDER_MALE = "MALE";
    /**статическое поле для хранения значения пола FEMALE*/
    public static final String GENDER_FEMALE = "FEMALE";
    /**Поле для хранения фамилии*/
    private String surname;
    /**Поле для хранения имени*/
    private String fName;
    /**Поле для хранения отчества*/
    private String sName;
    /**Поле для хранения даты рождения*/
    private LocalDate birthday;
    /**Поле для хранения номера телефона*/
    private String phone;
    /**Поле для хранения e-mail*/
    private String email;
    /**Поле для хранения пола персоны (возможные значения: GENDER_MALE или GENDER_FEMALE )*/
    private String gender;

    /**Создает новую персону c заданными значениями фамилии, имени, отчества, даты рождения, телефона, email и пола
     * @param surname фамилия
     * @param fName имя
     * @param sName отчество
     * @param birthday дата рождения
     * @param phone номер телефона
     * @param email email
     * @param gender пол, (возможные значения: GENDER_MALE или GENDER_FEMALE )
     * */
    public Person(String surname, String fName, String sName, LocalDate birthday, String phone, String email, String gender) {
        this.surname = surname;
        this.fName = fName;
        this.sName = sName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
    }

    /**Создает новую персону и заполняет данные по ней значениями по умолчанию*/
    public Person() {

    }

    /**Возвращает значение поля {@link Person#surname}
     * @return строку с фамилией*/
    public String getSurname() {
        return surname;
    }

    /**Устанавливает значение поля {@link Person#surname}
     * @param surname - новая фамилия*/
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**Возвращает значение поля {@link Person#fName}
     * @return строку с именем*/
    public String getFName() {
        return fName;
    }

    /**Устанавливает значение поля {@link Person#fName}
     * @param fName - новое имя*/
    public void setFName(String fName) {
        this.fName = fName;
    }
    /**Возвращает значение поля {@link Person#sName}
     * @return строку с отчеством*/
    public String getSName() {
        return sName;
    }

    /**Устанавливает значение поля {@link Person#sName}
     * @param sName - новое отчество*/
    public void setSName(String sName) {
        this.sName = sName;
    }
    /**Возвращает значение поля {@link Person#birthday}
     * @return объект LocalDate, соответствующий дате рождения */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**Устанавливает значение поля {@link Person#birthday}
     * @param birthday - новая дата рождения*/
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    /**Возвращает значение поля {@link Person#phone}
     * @return строку с номером телефона*/
    public String getPhone() {
        return phone;
    }

    /**Устанавливает значение поля {@link Person#phone}
     * @param phone - новый номер телефона*/
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**Возвращает значение поля {@link Person#email}
     * @return строку с email*/
    public String getEmail() {
        return email;
    }

    /**Устанавливает значение поля {@link Person#email}
     * @param email - новый email*/
    public void setEmail(String email) {
        this.email = email;
    }

    /**Возвращает строку, содержащую информацию об объекте Person в указанном формате */
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s",this.surname, this.fName, this.sName, this.birthday, this.email, this.phone, this.gender);
    }
}
