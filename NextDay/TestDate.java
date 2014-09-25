package TestDate;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Date.ClassDate;

public class TestDate {

	@Test
	public void test1() {
		ClassDate date = new ClassDate(-1, 2, 3);
		ClassDate expected = null;
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		ClassDate date = new ClassDate(11, 13, 2013);
		ClassDate expected = null;
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		ClassDate date = new ClassDate(11, 11, 2013);
		ClassDate expected = new ClassDate(12, 11, 2013);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
	@Test
	public void test4() {
		ClassDate date = new ClassDate(31, 1, 2013);
		ClassDate expected = new ClassDate(1, 2, 2013);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
	@Test
	public void test5() {
		ClassDate date = new ClassDate(30, 4, 2013);
		ClassDate expected = new ClassDate(1, 5, 2013);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
	@Test
	public void test6() {
		ClassDate date = new ClassDate(29, 2, 2004);
		ClassDate expected = new ClassDate(1, 3, 2004);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
	@Test
	public void test7() {
		ClassDate date = new ClassDate(28, 2, 2004);
		ClassDate expected = new ClassDate(29, 2, 2004);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
	@Test
	public void test8() {
		ClassDate date = new ClassDate(29, 2, 2013);
		ClassDate expected = null;
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void test9() {
		ClassDate date = new ClassDate(28, 2, 2013);
		ClassDate expected = new ClassDate(1, 3, 2013);
		ClassDate actual = date.NextDate();
		Assert.assertEquals(expected.toString(), actual.toString());
	}
}
