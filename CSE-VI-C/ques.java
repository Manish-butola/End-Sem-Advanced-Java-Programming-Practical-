import jdbc.*;
import java.io.BufferedReader;
import java.io.IOException;
import.sql.*;

public class ques{
publuc static void main("String[] args throws IOException")
  connection con= null;
  Statement stat=null;
  Resultset  res= null;


try{
con=DriverManager.getConnection("jdbc:mysql://localhost:8080/practicalDB","root","Shalini31");

stat=con.createStatement();
res=stat.executeQuery("select * from book");

while(res.next()){
  System.out.println("Acession No\t" + "Title\t"+"Author\t"+"Edition\t"+"Publisher\t");

}

bufferedReader br=new Buffered(new InputStreamReader(System.in));

int n = Interger.parseInt(br.readline());
String query ="select * from book wher AccessionNO ="+  n;
res = stat.executeQuery(query);


while(res.next()){
  System.out.println("Acession No\t" + "Title\t"+"Author\t"+"Edition\t"+"Publisher\t");
  System.out.println(res.getString("AccessionNo") +res.getString("Title")+res.getString("Author")+res.getString("Edition")+res.getString("Publisher");
}
}
catch(Exception exc){
    exc.printStackTrace();
}










