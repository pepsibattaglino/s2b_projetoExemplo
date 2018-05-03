package pucrs.s2b.exemplo02;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class AppTest {

	@Test
	@Parameters({"17, 30, 47", 
				 "22, 90, 112" })
	public void testSomar(int val1, int val2, int res) throws Exception {
		assertEquals(App.somar(val1, val2), res);
	}//FIXME: Usuar sintaxe nova com assertThat()

//	@Test
//	public void testSomar2() {
//		assertEquals(0, App.somar(0, 0));
//	}
}

//@RunWith(JUnitParamsRunner.class)
//public class PersonTest {
//
//  @Test
//  @Parameters({"17, false", 
//               "22, true" })
//  public void personIsAdult(int age, boolean valid) throws Exception {
//    assertThat(new Person(age).isAdult(), is(valid));
//  }
//  
//}