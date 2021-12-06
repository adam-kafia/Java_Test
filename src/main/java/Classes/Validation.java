package Classes;


import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;



public final class Validation {
  
  public static boolean isValidEmailAddress(String aEmailAddress){
    if (aEmailAddress == null) return false;
    boolean result = true;
    try {
      @SuppressWarnings("unused")
	InternetAddress emailAddr = new InternetAddress(aEmailAddress);
      if (! hasNameAndDomain(aEmailAddress)) {
        result = false;
      }
    }
    catch (AddressException ex){
      result = false;
    }
    return result;
  }

  private static boolean hasNameAndDomain(String aEmailAddress){
    String[] tokens = aEmailAddress.split("@");
    return 
      tokens.length == 2 &&
      Util.textHasContent(tokens[0]) && 
      Util.textHasContent(tokens[1]) 
    ;
  }
  
  
}