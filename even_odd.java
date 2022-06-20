int c=0;
String even="even", odd="odd";
String n=input1+"";
		if(input2.equals(even))
		{
			for(int i=0;i<n.length();i++)
			{
				int mynum=n.charAt(i)-'0';
				if(mynum%2==0)
				{
					c+=mynum;
				}
			}
		}
		if(input2.equals(odd))
		{
			for(int i=0;i<n.length();i++)
			{
				int mynum=n.charAt(i)-'0';
				if(mynum%2!=0)
				{
					c=c+mynum;
				}
			}
		}
		return c;
