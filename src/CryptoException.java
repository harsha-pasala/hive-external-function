import org.apache.hadoop.hive.ql.exec.UDF;

public class CryptoException extends UDF {
	public String evaluate(String isHardStop, String dummyValue) throws CustomException {
		try {
			if (isHardStop.equalsIgnoreCase("a")) {
				return "DB Support Test: hardstop is a";
			} else if (isHardStop.equalsIgnoreCase("b")) {
				return "DB Support Test: hardstop is b";
			} else {
			    throw new CustomException("Unknown value custom message", null, true, false);
			}
		}
		catch(CustomException e) {
			String errorMessage = "Custom Exception: " + e.getMessage();
			System.err.println(errorMessage);
			throw e;
		}
	}
}