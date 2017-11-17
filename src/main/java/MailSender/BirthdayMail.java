package MailSender;

public class BirthdayMail implements MailCode {
    private static String content = "Hello it's your birthday{name}, You are {age},Love You";
    public String generateEmail(Client client) {
        try{
            String returnedEmail = content;
            returnedEmail.replace("{name}", client.getName());
            returnedEmail.replace("{age}", client.getName());
            return returnedEmail;
        }catch (Exception e){
            return null;
        }
    }
    public static void setContent(String content){
        BirthdayMail.content = content;
    }
}
