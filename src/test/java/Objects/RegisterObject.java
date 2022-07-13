package objects;

import java.util.HashMap;

public class RegisterObject {

    private String firstName;
    private String lastName;
    private String Address;
    private String emailAddress;
    private String Phone;
    private String Gender;
    private String Hobbies;
    private String Languages;
    private String Skills;
    private String selectCountry;
    private String Year;
    private String Month;
    private String Day;
    private String Password;
    private String confirmPassword;

    private String file;

    public RegisterObject(HashMap<String, String> inputData){
        populateObject(inputData);

    }





    public void populateObject(HashMap<String, String> inputData){
        for (String key: inputData.keySet()){
            switch (key){
                case "firstName":
                    setFirstName(inputData.get(key));
                    break;
                case "lastName":
                    setLastName(inputData.get(key));
                    break;
                case "address":
                    setAddress(inputData.get(key));
                    break;
                case "emailAddress":
                    setEmailAddress(inputData.get(key));
                    break;
                case "phone":
                    setPhone(inputData.get(key));
                    break;
                case "language":
                    setLanguages(inputData.get(key));
                    break;
                case "skills":
                    setSkills(inputData.get(key));
                    break;
                case "country":
                    setSelectCountry(inputData.get(key));
                    break;
                case "year":
                    setYear(inputData.get(key));
                    break;
                case "month":
                    setMonth(inputData.get(key));
                    break;
                case "day":
                    setDay(inputData.get(key));
                    break;
                case "password":
                    setPassword(inputData.get(key));
                    break;
                case "confirmPassword":
                    setConfirmPassword(inputData.get(key));
                    break;
                case "file":
                    setFile(inputData.get(key));
                    break;

            }
        }
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    public String getLanguages() {
        return Languages;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        Skills = skills;
    }

    public String getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(String selectCountry) {
        this.selectCountry = selectCountry;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {

        this.file = file;
    }
}
