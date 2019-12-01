package application.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;



@Service
public class CommunicationServiceTwilioImpl implements CommunicationService{
    @Value("${twilio.account_SID}")
    private final String ACCOUNT_SID;
    @Value("${twilio.auth_token}")
    private final String AUTH_TOKEN;
    @Value("${twilio.phone}")
    private final String PHONE_FROM;

    public CommunicationServiceTwilioImpl(@Value("${twilio.account_SID}") String accountSID, @Value("${twilio.auth_token}") String authToken, @Value("${twilio.phone}") String phone) {
    	this.ACCOUNT_SID = accountSID;
    	this.AUTH_TOKEN = authToken;
    	this.PHONE_FROM = phone;
    }


    @Override
    public void sendSMS(String phoneTo, String text){
    	try {
	        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Message message = Message.creator(new PhoneNumber(phoneTo),
	            new PhoneNumber(PHONE_FROM),
	            text).create();
    	}catch(Exception e) {
    		// TODO: Handle error
    	}
    }
}
