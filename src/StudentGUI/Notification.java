package StudentGUI;
import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class Notification {
    String toolTip, title, body;
    MessageType messageType;
    
    public Notification() {
        this.toolTip = "";
        this.title = "";
        this.body = "";
        this.messageType = MessageType.INFO;
    }
    
    public Notification(String toolTip, String title, String body, MessageType messageType) {
       this.toolTip = toolTip;
       this.title = title;
       this.body = body; 
       this.messageType = MessageType.INFO;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setBody(String body) {
        this.body = body;
    }
    
    public void setToolTip(String toolTip) {
        this.toolTip = toolTip;
    }
    
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getToolTip() {
        return this.toolTip;
    }
    
    public String getBody() {
        return this.body;
    }
    
    public MessageType getMessageType() {
        return this.messageType;
    }
    
    public void displayTray() throws AWTException {
        //Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();
        
        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
        
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip(this.toolTip);
        tray.add(trayIcon);

        trayIcon.displayMessage(this.title, this.body, messageType);
    }
}
