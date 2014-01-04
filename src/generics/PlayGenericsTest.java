package generics;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.hamcrest.core.*;

public class PlayGenericsTest {
	
	@Test
	public void maxTest(){
		assertSame("string_greater", PlayGenerics.max("string", "string_greater") );
		assertSame( 10, PlayGenerics.max(2,10) );
	}

}
