
public class Ball {
	private static  int  x[] = new int[20];
	public Ball(){}
	public void set (int a[]){
		for(int i=0; i<a.length; i++){
			x[i]=a[i];
		}
	}
	
	public  String  Search() {
		if(x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9]<x[10]+x[11]+x[12]+x[13]+x[14]+x[15]+x[16]+x[17]+x[18]+x[19])
		{
			if(x[1]+x[2]+x[3]+x[4] +x[5]+x[6]+x[7]+x[8]+x[9]==x[10]+x[11]+x[12]+x[13]+x[14]+x[15]+x[16]+x[17]+x[18])
			{
				System.out.println("1�����Ǽٵ�");
				return "1�����Ǽٵ�";
			}
			
			if(x[1]+x[2]+x[3]+x[4]<x[5]+x[6]+x[7]+x[8])
			{
				if(x[1]+x[2]<x[3]+x[4])
				{
					if(x[1]<x[2])
					{
						System.out.println("2�����Ǽٵ�");
						return "2�����Ǽٵ�";
					}
					else
					{
						System.out.println("3�����Ǽٵ�");
						return "3�����Ǽٵ�";
					}
				}
				else
				{
					if(x[3]<x[4])
					{
						System.out.println("4�����Ǽٵ�");
						return "4�����Ǽٵ�";
					}
					else
					{
						System.out.println("5�����Ǽٵ�");
						return "5�����Ǽٵ�";
					}
				}
			}
			else
			{
				if(x[6]+x[7]==x[8]+x[9])
				{
					System.out.println("6�����Ǽٵ�");
					return "6�����Ǽٵ�";
				}
				else
				{
					if(x[6]+x[7]<x[8]+x[9])
					{
						if(x[6]<x[7])
						{
							System.out.println("7�����Ǽٵ�");
							return "7�����Ǽٵ�";
						}
						else
						{
							System.out.println("8�����Ǽٵ�");
							return "8�����Ǽٵ�";
						}
					}
					else
					{
						if(x[8]<x[9])
						{
							System.out.println("9�����Ǽٵ�");
							return "9�����Ǽٵ�";
						}
						else
						{
							System.out.println("10�����Ǽٵ�");
							return "10�����Ǽٵ�";
						}
					}
				}	
			}
		}
		else
		{
			if(x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]==x[11]+x[12]+x[13]+x[14]+x[15]+x[16]+x[17]+x[18]+x[19])
			{
				System.out.println("11�����Ǽٵ�");
				return "11�����Ǽٵ�";
			}
			else
			{
				if(x[11]+x[12]+x[13]+x[14]<x[15]+x[16]+x[17]+x[18])
				{
					if(x[11]+x[12]<x[13]+x[14])
					{
						if(x[11]<x[12])
						{
							System.out.println("12�����Ǽٵ�");
							return "12�����Ǽٵ�";
						}
						else
						{
							System.out.println("13�����Ǽٵ�");
							return "13�����Ǽٵ�";
						}
					}
					else
					{
						if(x[13]<x[14])
						{
							System.out.println("14�����Ǽٵ�");
							return "14�����Ǽٵ�";
						}
						else
						{
							System.out.println("15�����Ǽٵ�");
							return "15�����Ǽٵ�";
						}	
					}
				}
				else
				{
					if(x[16]+x[17]==x[18]+x[19])
					{
						System.out.println("16�����Ǽٵ�");
						return "16�����Ǽٵ�";
					}
					else
					{
						if(x[16]+x[17]<x[18]+x[19])
						{
							if(x[16]<x[17])
							{
								System.out.println("17�����Ǽٵ�");
								return "17�����Ǽٵ�";
							}
							else
							{
								System.out.println("18�����Ǽٵ�");
								return "18�����Ǽٵ�";
							}	
						}
						else
						{
							if(x[18]<x[19])
							{
								System.out.println("19�����Ǽٵ�");
								return "19�����Ǽٵ�";
							}
							else
							{
								System.out.println("20�����Ǽٵ�");
								return "20�����Ǽٵ�";
							}	
						}
					}	
				}
			}	
		}
	}
	
	public static void main(String args[])
	{
		Ball b=new Ball();
		int a0[]={1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a1[]={3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a2[]={3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};		
		int a3[]={3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a4[]={3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a5[]={3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a6[]={3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3};
		int a7[]={3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3,3};
		int a8[]={3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3,3};
		int a9[]={3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3,3};
	    int a10[]={3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3,3};
		int a11[]={3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3,3};
		int a12[]={3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3,3};
		int a13[]={3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3,3};
		int a14[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3,3};
		int a15[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3,3};
		int a16[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3,3};
		int a17[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3,3};
		int a18[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,3};
		int a19[]={3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1};
		b.set(a0);
		System.out.println(b.Search());
		b.set(a1);
		System.out.println(b.Search());
		b.set(a2);
		System.out.println(b.Search());
		b.set(a3);
		System.out.println(b.Search());
		b.set(a4);
		System.out.println(b.Search());
		b.set(a5);
		System.out.println(b.Search());
		b.set(a6);
		System.out.println(b.Search());
		b.set(a7);
		System.out.println(b.Search());
		b.set(a8);
		System.out.println(b.Search());
		b.set(a9);
		System.out.println(b.Search());
		b.set(a10);
		System.out.println(b.Search());
		b.set(a11);
		System.out.println(b.Search());
		b.set(a12);
		System.out.println(b.Search());
		b.set(a13);
		System.out.println(b.Search());
		b.set(a14);
		System.out.println(b.Search());
		b.set(a15);
		System.out.println(b.Search());
		b.set(a16);
		System.out.println(b.Search());
		b.set(a17);
		System.out.println(b.Search());
		b.set(a18);
		System.out.println(b.Search());
		b.set(a19);
		System.out.println(b.Search());
		
	}
	   

}

