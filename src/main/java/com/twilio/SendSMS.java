package com.twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SendSMS {
	public static final String ACCOUNT_SID = "ACdcbdf968f1fb931cecd3157e90ca3ba7";
	public static final String AUTH_TOKEN = "d3d281206e3fb56b469348aad2c2dee2";
	
	public static void main(String[] args) {
		
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator(
				new PhoneNumber("+918800428409"),
				new PhoneNumber("+17815575107"),
				"Hi Bro! What's up? Feeling any stronger? They say what doesn't kill you makes you stronger! :D"
				).create();
		
		System.out.println(message.getSid());
	}
}