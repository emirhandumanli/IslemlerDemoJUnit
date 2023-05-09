package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testToplaNegativevePozitifSayi() {
		//GIVEN - ONKOSULLAR
		int sayi1 = -99;
		int sayi2 = 100;
		
		//WHEN - ASIL TEST
		int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
		
		//THEN - KONTROL VALİDASYON
		
		assertEquals(1, gercekSonuc);
		
	}
	
	public void testToplaIkıNegativevePozitifSayi() {
		//GIVEN - ONKOSULLAR
				int sayi1 = -99;
				int sayi2 = 100;
				
				//WHEN - ASIL TEST
				int gercekSonuc = Toplama.islemYap(sayi1, sayi2);
				
				//THEN - KONTROL VALİDASYON
				
				assertEquals(1, gercekSonuc);
	}
}
