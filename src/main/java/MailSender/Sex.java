package MailSender;

public enum Sex {
    WOMAN, MAN;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
