package MailSender;

public class MailSender {
    static private String email = "dobosevych@ucu.edu.ua";

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        MailSender.email = email;
    }

    public static boolean sendMail(MailInfo info){
        try {
            System.out.println("The email to" + info.getClient().getEmail()+"was sent");
            System.out.println(info.getMailCode().generateEmail(info.getClient()));
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
}
