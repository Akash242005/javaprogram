interface MessageService {
    void send();
}
class EmailService implements MessageService {
    public void send() {
        System.out.println("Email Sent");
    }
}
class SMSService implements MessageService {
    public void send() {
        System.out.println("SMS Sent");
    }
}
class Notification {
    MessageService service;
    Notification(MessageService service) {
        this.service = service;
    }
    void notifyUser() {
        service.send();
    }
}
public class DIPGood {
    public static void main(String[] args) {

        MessageService service = new SMSService();

        Notification n = new Notification(service);

        n.notifyUser();
        
    }
}
