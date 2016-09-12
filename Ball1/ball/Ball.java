
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
				System.out.println("1号球是假的");
				return "1号球是假的";
			}
			
			if(x[1]+x[2]+x[3]+x[4]<x[5]+x[6]+x[7]+x[8])
			{
				if(x[1]+x[2]<x[3]+x[4])
				{
					if(x[1]<x[2])
					{
						System.out.println("2号球是假的");
						return "2号球是假的";
					}
					else
					{
						System.out.println("3号球是假的");
						return "3号球是假的";
					}
				}
				else
				{
					if(x[3]<x[4])
					{
						System.out.println("4号球是假的");
						return "4号球是假的";
					}
					else
					{
						System.out.println("5号球是假的");
						return "5号球是假的";
					}
				}
			}
			else
			{
				if(x[6]+x[7]==x[8]+x[9])
				{
					System.out.println("6号球是假的");
					return "6号球是假的";
				}
				else
				{
					if(x[6]+x[7]<x[8]+x[9])
					{
						if(x[6]<x[7])
						{
							System.out.println("7号球是假的");
							return "7号球是假的";
						}
						else
						{
							System.out.println("8号球是假的");
							return "8号球是假的";
						}
					}
					else
					{
						if(x[8]<x[9])
						{
							System.out.println("9号球是假的");
							return "9号球是假的";
						}
						else
						{
							System.out.println("10号球是假的");
							return "10号球是假的";
						}
					}
				}	
			}
		}
		else
		{
			if(x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]==x[11]+x[12]+x[13]+x[14]+x[15]+x[16]+x[17]+x[18]+x[19])
			{
				System.out.println("11号球是假的");
				return "11号球是假的";
			}
			else
			{
				if(x[11]+x[12]+x[13]+x[14]<x[15]+x[16]+x[17]+x[18])
				{
					if(x[11]+x[12]<x[13]+x[14])
					{
						if(x[11]<x[12])
						{
							System.out.println("12号球是假的");
							return "12号球是假的";
						}
						else
						{
							System.out.println("13号球是假的");
							return "13号球是假的";
						}
					}
					else
					{
						if(x[13]<x[14])
						{
							System.out.println("14号球是假的");
							return "14号球是假的";
						}
						else
						{
							System.out.println("15号球是假的");
							return "15号球是假的";
						}	
					}
				}
				else
				{
					if(x[16]+x[17]==x[18]+x[19])
					{
						System.out.println("16号球是假的");
						return "16号球是假的";
					}
					else
					{
						if(x[16]+x[17]<x[18]+x[19])
						{
							if(x[16]<x[17])
							{
								System.out.println("17号球是假的");
								return "17号球是假的";
							}
							else
							{
								System.out.println("18号球是假的");
								return "18号球是假的";
							}	
						}
						else
						{
							if(x[18]<x[19])
							{
								System.out.println("19号球是假的");
								return "19号球是假的";
							}
							else
							{
								System.out.println("20号球是假的");
								return "20号球是假的";
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

