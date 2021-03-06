package strings.regExp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by King on 2016/2/6.
 */
public class EmailSpider {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("E:\\computer\\la1234.txt"));
            String line = "";
            while ((line = br.readLine()) != null){
                parse(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parse(String line) {
        Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");
        Matcher m = p.matcher(line);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
