String str=input1.toUpperCase()+" ";
		int k=0;
	   ArrayList<String> st=new ArrayList<>();
	   for(int i=0;i<str.length();i++)
	   {
		   
		   char ch=str.charAt(i);
		   if(ch==' ')
		   {
			   st.add(str.substring(k,i));
			   k=i+1;
		   }
		   
	   }
	   int arr[]=new int[st.size()];
	   for(int i=0;i<st.size();i++)
	   {
		   String s=st.get(i);
		   int sum=0;
		   int li=0;
		   int ri=s.length()-1;
		   if(s.length()%2==0)
		   {
		   while(li<=ri)
		   {
			   sum+=Math.abs(s.charAt(li)-s.charAt(ri));
			   li++;
			   ri--;
		   }
		   }
		   else
		   {
			   while(li<=ri)
		   {
			   sum+=Math.abs(s.charAt(li)-s.charAt(ri));
			   li++;
			   ri--;
		   }
		   		sum+=s.charAt(s.length()/2)-64;
		   }
		   arr[i]=sum;
	   }
	   System.out.print(arr[0]);
	String res="";
	for(int i:arr)
	{
		res=res+i;
	}
	   return Integer.parseInt(res);
