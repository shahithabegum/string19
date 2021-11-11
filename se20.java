import java.util.*;
import java.lang.*;
class se20
{
  public static void main(String arg[])
   {
     try
         {
            String st="thequickbrownfoxxofnworbquickthe";
	String s1=st.substring(5,17);
	System.out.println(s1.length());
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}