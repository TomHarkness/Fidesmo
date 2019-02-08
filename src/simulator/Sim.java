package simulator;

import helloFidesmo.ExampleCardlet;
import com.licel.jcardsim.samples.HelloWorldApplet;
import com.licel.jcardsim.smartcardio.CardSimulator;
import com.licel.jcardsim.smartcardio.CardTerminalSimulator;
import com.licel.jcardsim.utils.AIDUtil;
import com.licel.jcardsim.utils.ByteUtil;
import javacard.framework.AID;

import javax.smartcardio.*;
import java.security.NoSuchAlgorithmException;
import java.security.Security;


public class Sim {
    public static void main(String[] args) {
        // 1. Create simulator
        CardSimulator simulator = new CardSimulator();

// 2. Install applet
        AID appletAID = AIDUtil.create("F000000001");
        simulator.installApplet(appletAID, ExampleCardlet.class);

// 3. Select applet
        simulator.selectApplet(appletAID);

// 4. Send APDU
        CommandAPDU commandAPDU = new CommandAPDU(0x00, 0x01, 0x00, 0x00);
        ResponseAPDU response = simulator.transmitCommand(commandAPDU);

// 5. Check response status word
        int responseStatus = response.getSW();
        String responseDataAsString = new String(response.getData());
        System.out.println("Status: " + (responseStatus == 0x9000 ? "success": "error"));
        System.out.println("Data: " + responseDataAsString);
    }
}
