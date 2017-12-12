package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    String type;
    String language;

    public Keyboard(String type, String language) {
        this.type = type;
        this.language = language;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String sendData(String data) {
        return "click " + data;
    }
}
