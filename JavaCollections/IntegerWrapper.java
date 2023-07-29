class IntegerWrapper
{
	public static Integer intgr[] = new Integer[3];
	public static void main(String args[])
	{
		if(args.length != 2 )
			System.exit(1);

		try
		{
			intgr[0] = new Integer(args[0]);
		}catch(NumberFormatException nfe)
		{
			System.out.println("Passed value is not a number. Assuming a default of 1.");
			intgr[0] = new Integer(1);
		}

		try
		{
			intgr[1] = new Integer(args[1]);
		}catch(NumberFormatException nfe)
		{
			System.out.println("Passed value is not a number. Assuming a default of 1.");
			intgr[1] = new Integer(1);
		}


		System.out.println("Byte value : " + intgr[0].byteValue());
		System.out.println("Integer value : " + intgr[0]);
		if(intgr[0].compareTo(intgr[1]) < 0)
			System.out.println(intgr[0] + " is less than " + intgr[1]);
		else if(intgr[0].compareTo(intgr[1]) == 0)
			System.out.println(intgr[0] + " is equal to " + intgr[1]);
		else
			System.out.println(intgr[0] + " is greater than " + intgr[1]);

		try
		{
			intgr[0] = Integer.decode(args[0]);
		}catch(NumberFormatException nfe)
		{
			System.out.println("Passed value is not a number. Assuming a default of 1.");
			intgr[0] = new Integer(1);
		}

		try
		{
			intgr[1] = Integer.decode(args[1]);
		}catch(NumberFormatException nfe)
		{
			System.out.println("Passed value is not a number. Assuming a default of 1.");
			intgr[1] = new Integer(1);
		}

		if(intgr[0].compareTo(intgr[1]) < 0)
			for(int i=intgr[0].intValue();i <= intgr[1].intValue();i++)
				System.out.print(i + "\t");
		else if(intgr[1].compareTo(intgr[0]) > 0)
			for(int i=intgr[1].intValue();i >= intgr[0].intValue();i--)
				System.out.print(i + "\t");
		else
			System.out.println(intgr[0] + " is equal to " + intgr[1]);

		System.out.println("Double value : " + intgr[0].doubleValue());
		System.out.println("Float value : " + intgr[1].floatValue());

		/*This method prints the value of the numeric property. If the property contains alphanumeric value, then the integer reference refers to null.*/
		intgr[2] = Integer.getInteger(System.getProperty("java.specification.version"));
		System.out.println("java.specification.version : " + intgr[2]);
		for(int i=0;i<intgr.length-1;i++)
			System.out.println("Hashcode of " + intgr[i] + " : " + intgr[i].hashCode());

		for(int i=0;i<intgr.length-1;i++)
			System.out.println("Long Value : " + intgr[i] + " : " + intgr[i].longValue());

		String s = new String("99");
		try
		{
			int j = Integer.parseInt(s);
			System.out.println("Number in String converted to Integer : " + j);
			j = Integer.parseInt("879", 10);
			System.out.println("Number in String converted to Decimal Integer : " + j);
		}catch(NumberFormatException nfe)
		{
		}

		for(int i=0;i<intgr.length-1;i++)
			System.out.println("Short Value : " + intgr[i].shortValue());

		for(int i=0;i<intgr.length-1;i++)
			System.out.println("Floatt Value : " + intgr[i].floatValue());


		for(int i=0;i<intgr.length-1;i++)
			System.out.println("Binary equivalent of " + intgr[i] + " : " + Integer.toBinaryString(intgr[i].intValue()));

		intgr[2] = Integer.valueOf(args[0]);//Interprets the value of the given string as a signed integer value and returns an integer object containing the integer value.
		
		for(int i=0;i<intgr.length;i++)
			System.out.println(intgr[i]);

		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE);

	}
}
