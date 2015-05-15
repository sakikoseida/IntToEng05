package intoEnglish;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import intoEnglish.IntToEng;

import org.junit.Test;

public class test1 {
    
	@Test
	public void four() {
		
		String expected = "four";
		String actual = IntToEng.translateEng(4);
		assertThat(actual, is(expected));
	}

  	@Test
	public void eleven() {
		
		String expected = "eleven";
		String actual = IntToEng.translateEng(11);
		assertThat(actual, is(expected));
	}
  	
  	@Test
	public void hundredtwenty() {
		
		String expected = "one hundred twenty";
		String actual = IntToEng.translateEng(120);
		assertThat(actual, is(expected));
	}
  	@Test
	public void onethousandtwohundredthirtynine() {
		
		String expected = "one thousand two hundred thirty nine";
		String actual = IntToEng.translateEng(1239);
		assertThat(actual, is(expected));
	}
/*	
	@Test
	public void test() {
		
		System.out.println(ite.translateEng(4));
		System.out.println(ite.translateEng(11));
		System.out.println(ite.translateEng(20));
		System.out.println(ite.translateEng(29));
		
		System.out.println(ite.translateEng(100));
		System.out.println(ite.translateEng(110));
		System.out.println(ite.translateEng(135));
		System.out.println(ite.translateEng(500));
		
		
		System.out.println(ite.translateEng(1000));
	}
*/
}
