import java.io.*;
import java.net.*;

public class Client{
public static void main(String args[])throws Exception{

Socket s=new Socket("192.168.43.175",8080);

DataInputStream dataRead=new DataInputStream(s.getInputStream());

DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

String str="",str2="";

while(!str.equals("adios")){
str=br.readLine();
dataWrite.writeUTF(str);
dataWrite.flush();
str2=dataRead.readUTF();
System.out.println("Server says : "+str2);
}

dataRead.close();
s.close();
}
}