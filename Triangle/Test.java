package JunitTest;

import static org.junit.Assert.*;

import javax.sound.midi.Track;

import org.junit.Assert;

import Triangle.Triangle;

public class Test {

	@org.junit.Test
	public void test1() {
		Triangle triangle = new Triangle(0, 1, 4);
		int expected = -1;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
	@org.junit.Test
	public void test2() {
		Triangle triangle = new Triangle(-1, -1, 4);
		int expected = -1;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
	@org.junit.Test
	public void test3() {
		Triangle triangle = new Triangle(1, 3, 4);
		int expected = -1;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
	@org.junit.Test
	public void test4() {
		Triangle triangle = new Triangle(3, 5, 4);
		int expected = 0;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
	@org.junit.Test
	public void test5() {
		Triangle triangle = new Triangle(3, 3, 4);
		int expected = 1;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
	@org.junit.Test
	public void test6() {
		Triangle triangle = new Triangle(3, 3, 3);
		int expected = 2;
		int actual = triangle.checkTriangle();
		Assert.assertEquals(expected, actual);
	}
}
