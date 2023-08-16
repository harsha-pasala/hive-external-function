import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



public class UdfDivisionV8 extends UDF {
	 public Integer evaluate(int value) throws Exception {
		 try {
			 Logger.getLogger(UdfDivisionV8.class).setLevel(Level.ERROR);
			 
			 if (value != 0) {
				 return 1 / value;
			 }
			 else {
				 throw new CustomException("A custom exception message", null, true, false);
			 }
     } catch (CustomException ce) {
         String errorMessage = "Custom Exception: " + ce.getMessage();
         System.err.println(errorMessage);
         throw ce;
		 }
	}
}