package objects;

import Objects.InterfaceObject;

import java.util.HashMap;

public class LoginObject implements InterfaceObject {

    private String loginPage;
    private String email;
    private String password;
    private String errorMessage;

    //trebuie sa fac un constructor care sa mapeze valorile din hashmap la fieldurile
    //din clasa

    public LoginObject(HashMap<String, String> inputData){

        //trebuie sa parcurg hashmap si pe rand sa mapez la valorile de sus
        populateObject(inputData);
    }

    public void populateObject(HashMap<String, String> inputData){
        for (String key: inputData.keySet()){
            switch (key){
                case "loginPage":
                    setLoginPage(inputData.get(key));
                    break;
                case "email":
                    setEmail(inputData.get(key));
                    break;
                case "password":
                    setPassword(inputData.get(key));
                    break;
                case "errorMessage":
                    setErrorMessage(inputData.get(key));
                    break;
            }
        }
    }

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
