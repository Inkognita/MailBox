package MailSender;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    public MailBox(){
        infos = new ArrayList<MailInfo>();
    }
    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }
    public void sendAll(){
        for (MailInfo info : infos) {
            if(MailSender.sendMail(info)){
                infos.remove(info);
            }
        }
    }
}
