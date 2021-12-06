package Classes;




import java.util.logging.Logger;





/**
 Static convenience methods for common tasks, which eliminate code duplication.
*/
public final class Util {

   /**
    Return <tt>true</tt> only if <tt>aText</tt> is not null,
    and is not empty after trimming. (Trimming removes both
    leading/trailing whitespace and ASCII control characters.)
   
    <P> For checking argument validity, {@link Args#checkForContent} should 
    be used instead of this method.
    
    <P>This method is particularly useful, since it is very commonly required.
   
    @param aText possibly-null.
   */
   public static boolean textHasContent(String aText) {
     return (aText != null) && (aText.trim().length() > 0);
   }

  /**
   Return <tt>true</tt> only if <tt>aNumber</tt> is in the range 
   <tt>aLow..aHigh</tt> (inclusive).
  
   <P> For checking argument validity, {@link Args#checkForRange} should 
   be used instead of this method.
  
   @param aLow less than or equal to <tt>aHigh</tt>.
  */
  static public boolean isInRange( int aNumber, int aLow, int aHigh ){
    if (aLow > aHigh) {
      throw new IllegalArgumentException("Low is greater than High.");
    }
    return (aLow <= aNumber && aNumber <= aHigh);
  }

  /**
   Return <tt>true</tt> if <tt>aBoolean</tt> equals "true" (ignore case), or 
   <tt>false</tt> if <tt>aBoolean</tt> equals "false" (ignore case).
  
  <P>Note that this behavior is different from that of <tt>Boolean.getValue</tt>.
  
   @param aBoolean equals "true" or "false" (not case-sensitive).
  */
  public static Boolean parseBoolean(String aBoolean){
    if ( aBoolean.equalsIgnoreCase("true") ) {
      return Boolean.TRUE;
    }
    else if ( aBoolean.equalsIgnoreCase("false") ) {
      return Boolean.FALSE;
    }
    else {
      throw new IllegalArgumentException("Cannot parse into Boolean: " + aBoolean);
    }
  }
  
  /**
   Return a {@link Logger} whose name follows a specific naming convention.
  
   <P>The conventional logger names are taken as   
   <tt>aClass.getPackage().getName()</tt>.
   
   <P>Logger names appearing in the <tt>logging.properties</tt> config file
   must match the names returned by this method.
  */
  public static Logger getLogger(Class<?> aClass){
     return Logger.getLogger(aClass.getPackage().getName());  
   }
  
  /**
  Parse text into a {@link Date}. If the text has no content, then return <tt>null</tt>.
  */

  }

 


