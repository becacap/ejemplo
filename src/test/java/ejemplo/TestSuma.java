package ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSuma
{

	@Test
	void test()
	{
		Jdb jdb= new Jdb();
		assertEquals(jdb.suma(5, 5),10);
		
	}

}
