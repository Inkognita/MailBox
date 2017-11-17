package MailSender;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode){
        this.client = client;
        this.mailCode = mailCode;
    }

    public Client getClient() {
        return client;
    }

    public MailCode getMailCode() {
        return mailCode;
    }
}
