package application.service;

public interface CommunicationService{
    public abstract void sendSMS(String phoneTo, String text);
}
