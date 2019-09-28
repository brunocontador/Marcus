import org.junit.Test;

import junit.framework.TestCase;

public class TestValores extends TestCase {

	private Valores val;

	public void setUp() throws Exception {
		val = new Valores();
		val.ins(5);
		val.ins(12);
		val.ins(1);
		val.ins(30);
		val.ins(152);
		val.ins(6);
		val.ins(6);
		val.ins(6);
	}

	@Test
	public void testIns() {
		assertEquals(true, val.ins(2));
	}

	@Test
	public void testDel() {
		assertEquals(12, val.del(1));
	}

	@Test
	public void testMaior() {
		assertEquals(152, val.greater());
	}

	@Test
	public void testMenor() {
		assertEquals(true, val.ins(2));
		assertEquals(1, val.lower());
	}

	@Test
	public void testMedia() {
		assertEquals(true, val.ins(2));
		assertEquals(24.444444444444443, val.mean());
	}

}
