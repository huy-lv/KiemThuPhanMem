package TestJUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import PTB2.PTB2;

public class TestPTB2 {

	@Test
	public void test1() {
		PTB2 t = new PTB2(0,0,0);
		int expected = 0;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		PTB2 t = new PTB2(0,0,1);
		int expected = -1;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		PTB2 t = new PTB2(0,2,3);
		int expected = 1;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test4() {
		PTB2 t = new PTB2(1,2,3);
		int expected = -1;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test5() {
		PTB2 t = new PTB2(1,-2,1);
		int expected = 1;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test6() {
		PTB2 t = new PTB2(2,6,3);
		int expected = 2;
		int actual = t.GiaiPTB2();
		Assert.assertEquals(expected, actual);
	}
}
