import java.io.*;
public class JTriangle {
     private int a, b, c;
     private static  int x1, x2, x3;
     private static String  s1, s2, s3;
     public void setA(int a)
      {
    	  this.a=a;
    	  
      }
     public void setB(int b)
     {
   	  this.b=b;
   	  
     }
     public void setC(int c)
     {
   	  this.c=c;
   	  
     }
     public boolean IsTriangle()
     {
    	 if(a+b>c&&a+c>b&&b+c>a&&a!=0&&b!=0&&c!=0)
    		 return true;
    	 else
    		 return false;
     }
     public JTriangle(){
    	 
     }
     public JTriangle(int _a,int _b,int _c)
     {
    	 setA(_a);
    	 setB(_b);
    	 setC(_c);
    	 
     }
     public String JudgeTriangle()
     {
    	 if(IsTriangle())
    	 {
    		 if(a==b&&a==c)
    		 {
    			 return "等边三角形";
    		 }
    		 else  if(a==b||b==c||a==c)
    		 {
    			 return "等腰三角形";
    		 }
    		 else
    		 {
    			 return  "一般三角形";
    		 }
    	 }
    	 else 
    		 return  "不能组成三角形";
     }
     public boolean ISNumble(String s)
     {
    	 if(s.length()==0)
    	 {
    		 return false;
    	 }
    	 else 
    	 {
    		 char ch[]=s.toCharArray();
    		 for(int i=0;i<ch.length;i++)
    		 {
    			 if(ch[i]>='0'&&ch[i]<='9')
    				 continue;
    			 else
    				 return false;
    		 }
    		 return true;
    	 }
     }
     public void SetTriangle()
     {
    	 try
    	 {
    		 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    		 System.out.println("请输入三角形的三边");
    		 System.out.println("a=");
    		 s1=in.readLine();
    		  while(!ISNumble(s1))
    		 {
    			 System.out.println("你输入的不是个数字");
    			 System.out.println("a= ");
    			 s1=in.readLine();
    		 }
    		 
    		 System.out.println("b= ");
    		 s2=in.readLine();
    		 while(!ISNumble(s2))                
    		 {
   			 System.out.println("你输入的不是个数字");
   			 System.out.println("b= ");
   			 s2=in.readLine();
    		 }
    		 System.out.println("c= ");
    		 s3=in.readLine();
    		 while(!ISNumble(s3))                
    		 {
   			 System.out.println("你输入的不是个数字");
   			 System.out.println("c= ");
   			 s3=in.readLine();
    		 }
    		 
    	 }
    	 catch(IOException e){}
    	 x1=Integer.parseInt(s1);
    	 x2=Integer.parseInt(s2);
    	 x3=Integer.parseInt(s3);
    	 setA(x1);
    	 setB(x2);
    	 setC(x3);
     }
     public  static  void main(String args[])
     {
    	 JTriangle  tr=new JTriangle();
    	 tr.SetTriangle();
    	 System.out.print(tr.JudgeTriangle());
     }
}
