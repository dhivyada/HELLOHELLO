import org.junit.Test;

import junit.framework.Assert;

public class Practise {
	@Test
	public void testCalculate() {
		Length l = new CentiMeter(200);
		Length ll = new Meter(4);
		Assert.assertTrue(new Meter(6).equals(l.sum(ll)));
		Assert.assertTrue(new CentiMeter(600).equals(l.sum(ll)));
	}

	@Test
	public void testEquals() {
		Length l = new CentiMeter(100);
		Length ll = new Meter(1);
		Assert.assertTrue(l.equals(ll));
	}
	
	@Test 
	public void testConversion(){
		Length len1 = new CentiMeter(600);
		Assert.assertEquals("6M",( new Meter(len1) ).toString() );
	}
   @Test
   public void testFindArea()
   {Length side1= new Centimeter(200);
   Length side2=new Metre(2);
   Assert.assertTrue(new Length(4).equals(side1.findArea(side2));
   }
}
