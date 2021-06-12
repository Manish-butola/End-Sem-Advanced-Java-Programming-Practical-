import java.io.*;
import java.net.*;

public class Client
  {
       public static void main(String args[])throws Exception
         {
	Socket ss=new Socket("localhost",8080);
	
	DataInputStream dataRead=new DataInputStream(ss.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(ss.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str1="",str2="";

	while(!str1.equals("bye"))
	   {
	       str1=br.readLine();
	       dataWrite.writeUTF(str1);
	       dataWrite.flush();
	       str2=dataRead.readUTF();
	       System.out.println("server : "+str2);
	    }

 	dataRead.close();
	ss.close();
	
         }
  }