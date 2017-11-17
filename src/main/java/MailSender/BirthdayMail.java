package MailSender;

public class BirthdayMail implements MailCode {
    private static String content = "Hello it's your birthday{name}, You are {age},Love You";
    public String generateEmail(Client client) {
        try{
            String returnedEmail = content;
            if(returnedEmail.contains("{name}")){
            returnedEmail.replace("{name}", client.getName());}
            if(returnedEmail.contains("{age}")){
            returnedEmail.replace("{age}", client.getName());}
            return returnedEmail;
        }catch (Exception e){
            return null;
        }
    }
}
