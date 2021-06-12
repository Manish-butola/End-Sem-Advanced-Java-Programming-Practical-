import  java.net.*;

import  java.io.*;

class Server{

public static void main(String[] args) throws Exception{ ServerSocket ss=new ServerSocket(8081); Socket s=ss.accept();

System.out.println("connection	is stable now ");

DataInputStream  dataRead=new  DataInputStream(s.getInputStream());

DataOutputStream  dataWrite=new	DataOutputStream(s.getOutputStream());

BufferedReader	br=new BufferedReader	(new InputStreamReader(System.in));

String  str="",str2="";

while(!str.equals("bye")){

str=dataRead.readUTF();//reads	whatever  is sent by the client

System.out.println("Client	says: "+str);

str2=br.readLine();

dataWrite.writeUTF(str2);

dataWrite.flush();

}

dataRead.close();

s.close();

ss.close();

}

}
