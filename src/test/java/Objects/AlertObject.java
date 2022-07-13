package objects;

import Objects.InterfaceObject;

import java.util.HashMap;

public class AlertObject implements InterfaceObject {
    private String alertmessage;
    private String alerttext;

    public AlertObject(HashMap<String, String> InputData){
        populateObject(InputData);

    }

   @Override
    public void populateObject(HashMap<String, String> inputData){
        for (String key: inputData.keySet()){
            switch (key){
                case "alertmessage":
                    setAlertmessage(inputData.get(key));
                    break;
                case "alerttext":
                    setAlerttext(inputData.get(key));
                    break;

            }
        }
    }


    public String getAlertmessage() {
        return alertmessage;
    }

    public void setAlertmessage(String alertmessage) {
        this.alertmessage = alertmessage;
    }

    public String getAlerttext() {
        return alerttext;
    }

    public void setAlerttext(String alerttext) {
        this.alerttext = alerttext;
    }
}

