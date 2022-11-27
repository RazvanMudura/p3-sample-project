package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;

public class Main {

    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application app = new Application(inputDevice, outputDevice);

        app.run();
    }
}
