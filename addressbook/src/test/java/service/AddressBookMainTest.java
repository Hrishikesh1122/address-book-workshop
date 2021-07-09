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
	public void given_AddingContactInList_IfSuccssful_ShouldReturnCorrectSizeOfList() throws CustomException {
		int result = addressbook.createContact("Hri", "Uga", "abcd", "Delhi",
				"Delhi", "12345","919858484777","abc@gmail.com");
		Assert.assertEquals(1, result);
	}

	@Test
	public void given_CreatingContactInListAddressbook_WhenFirstNameIncorrect_ShouldThrowCustomException() {
		try {
			int result = addressbook.createContact("hri", "U", "abcd", "delhi",
					"delhi", "12345","9858484","abc@gmail.com");
		}
		catch(CustomException e){
			Assert.assertEquals(CustomException.Exception.FIRST_NAME_INCORRECT,e.type);
		}
	}
	

}
