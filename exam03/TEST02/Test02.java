package exam03.TEST02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test02 {

    public static void main(String[] args){



        try{
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<html>");
            writer.write("\r\n\t<head>");
            writer.write("\r\n\t<meta charset=\"UTF-8\"/>");
            writer.write("\r\n\t<style>\r\n\t\t");
            writer.write("table { border-collapse: collapse; with:100%; }");
            writer.write("\r\n\t\tth,td {border:solid 1px #000;}");
            writer.write("\r\n\t</style>");
            writer.write("\r\n\t<h2>자바 환경정보</h2>");
            writer.write("\r\n\t</head>");
            writer.write("\r\n\t<body>");
            writer.write("\r\n\t\t<table>");
            writer.write("\r\n\t\t\t<th> 키 </th>");
            writer.write("<th>  </th>");
            

            for (Object k : System.getProperties().keySet()){

                String key = k.toString();
                String value = System.getProperty(key);
                writer.write("\r\n\t\t\t<tr><td>"+key+"</td>"+"<td>"+value+"</td>");
            }

            writer.write("\r\n\t\t</table>");
            writer.write("\r\n\t</body>");
            writer.write("\r\n</html>");
    

            writer.close();
        }catch(IOException e){
            e.printStackTrace();

        }


    }
    
}
