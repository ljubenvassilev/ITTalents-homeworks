package hw6;

import java.math.BigDecimal;
import java.math.RoundingMode;

class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastOutgoingCall;
	Call lastIncomingCall;
		
	void insertSimCard(String num){
		if(!(num.trim().matches("(08)\\d{8}"))){
			return;
		}
		simMobileNumber=num.trim();
		hasSimCard=true;
	}
	void removeSimCard(){
		hasSimCard=false;
	}
	void call (GSM receiver, int duration){
		if (!(hasSimCard || receiver.hasSimCard)) {
			System.out.println("Caller or receiver has no SIM card!");
			return;
		}
		if (duration <= 0||duration>60) {
			System.out.println("Wrong duration!");
			return;
		}
		if (simMobileNumber.equals(receiver.simMobileNumber)) {
			System.out.println("Call not allowed!");
			return;
		}
		Call call = new Call();
		call.caller = this;
		call.receiver = receiver;
		call.duration = duration;
		
		lastOutgoingCall = call;
		outgoingCallsDuration += call.duration;
		receiver.lastIncomingCall=call;
	}
	double getSumForCall(){
		return round(Call.priceForAMinute*outgoingCallsDuration,2);
	}

	double round(double value, int places) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	void printForLastOutgoingCall(){
		if(lastOutgoingCall==null){
			System.out.println("No calls made!");
			return;
		}
		System.out.println("The last number called is " + lastOutgoingCall.receiver.simMobileNumber);
		System.out.println("The call was " + lastOutgoingCall.duration + " minutes long");
		System.out.println("The price of the call was " + round(lastOutgoingCall.duration*Call.priceForAMinute,2));
	}
	void printForLastIncomingCall(){
		if(lastIncomingCall==null){
			System.out.println("No calls received!");
			return;
		}
		System.out.println("The last number that called you is " + lastIncomingCall.caller.simMobileNumber);
		System.out.println("The call was " + lastIncomingCall.duration + " minutes long");
	}
}
