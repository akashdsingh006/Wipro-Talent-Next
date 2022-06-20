
		int num=1,count=0,i;
		while(count<input1)
		{
			num=num+1;
			for( i=2;i<=num;i++)
			{
				if(num%i==0)
				break;
			}
			if(i==num)
			{
				count+=1;
			}
		}
		return num;
