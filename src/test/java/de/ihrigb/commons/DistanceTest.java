package de.ihrigb.commons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceTest {

	@Test
	public void test() throws Exception {
		Distance d2m = Distance.ofMeter(2);
		Assertions.assertAll(() -> Assertions.assertEquals(2000d, d2m.getMillimeter(), 0.0000001d),
				() -> Assertions.assertEquals(200d, d2m.getCentimeter(), 0.0000001d),
				() -> Assertions.assertEquals(20d, d2m.getDecimeter(), 0.0000001d),
				() -> Assertions.assertEquals(2d, d2m.getMeter(), 0.0000001d),
				() -> Assertions.assertEquals(.2d, d2m.getDecameter(), 0.0000001d),
				() -> Assertions.assertEquals(.02d, d2m.getHectometer(), 0.0000001d),
				() -> Assertions.assertEquals(.002d, d2m.getKilometer(), 0.0000001d));
	}
}
