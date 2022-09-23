package selenium;



import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class Testing3 {

	@Rule
	public ErrorCollector err = new ErrorCollector();
	

	@Test
	public void test6() {
	String actual = "abc";
	String expected = "abc";
	System.out.println("Before 1st Assert");
	Assert.assertEquals(expected, actual); // we use regular assert in the industry
	System.out.println("After 1st Assert");
	Assert.assertTrue("Verify 2>3", 2>3);
	System.out.println("After 2nd Assert");
	}

	@Test
	public void test7() {
		String actual = "abc";
		String expected = "abc1";
		System.out.println("Before 1st Assert");
		try {
			Assert.assertEquals(expected, actual);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in First catch");
		}
		System.out.println("After 1st Assert");
		try {
			Assert.assertTrue("Verify 2>3", 2>3);
		}catch(Throwable t) {
			err.addError(t);
			System.out.println("I'm in 2nd catch");
		}
		System.out.println("After 2nd Assert");
		}
}