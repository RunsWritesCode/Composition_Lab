package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    String type;
    int buttons;

    public Mouse(String type, int buttons) {
        this.type = type;
        this.buttons = buttons;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getButtons() {
        return buttons;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public String sendData(String data) {
        return data;
    }


}
