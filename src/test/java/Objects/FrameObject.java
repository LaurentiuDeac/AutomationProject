package Objects;

import java.util.HashMap;

public class FrameObject implements InterfaceObject {

    public FrameObject(HashMap<String, String> InputData) {
        populateObject(InputData);

    }

    private String singleiFrame;
    private String multipleiFrame;


    public String getSingleiFrame() {
        return singleiFrame;
    }

    public void setSingleiFrame(String singleiFrame) {
        this.singleiFrame = singleiFrame;
    }


    public String getMultipleiframe() {
        return multipleiFrame;
    }

    public void setMultipleiFrame(String multipleiFrame) {
        this.multipleiFrame = multipleiFrame;
    }


    @Override
    public void populateObject(HashMap<String, String> inputData){
        for (String key : inputData.keySet()) {
            switch (key) {
                case "singleiFrame":
                    setSingleiFrame(inputData.get(key));
                    break;
                case "multipleiFrame":
                    setMultipleiFrame(inputData.get(key));
                    break;
            }
        }
    }


}