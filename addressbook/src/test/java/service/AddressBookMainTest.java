package service;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressBookMainTest {
	
	AddressbookMain addressbook = null;
	
	@Before
	public void setUp() {
		addressbook = new AddressbookMain();
	}

	@Test
	public void given_CreatingContactInListAddressbook_ShouldReturn_CorrectSizeOfAddressbook() {
		int result = addressbook.createContact("Hrishi", "U", "abcd", "delhi",
				"delhi", "12345","9858484","abc@gmail.com");
		Assert.assertEquals(1, result);
	}

}
