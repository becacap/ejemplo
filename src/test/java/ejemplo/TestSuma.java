package ejemplo;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSuma
{

	@Test
	public void test()
	{
		Jdb jdb= new Jdb();
		assertEquals(jdb.suma(5, 5),10);
		
	}

}
