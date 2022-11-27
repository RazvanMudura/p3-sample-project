package ro.uvt.p3.io;

import java.io.IOException;
import java.io.OutputStream;


public class OutputDevice {
    private OutputStream outputStream;

    public OutputDevice() {
        this.outputStream = System.out;
    }

    public OutputDevice(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void writeMessage(String message) {
        try {
            outputStream.write(message.getBytes());
        } catch(IOException err) {
            err.printStackTrace();
        }
    }
}
