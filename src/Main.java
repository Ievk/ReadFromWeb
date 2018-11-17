import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://www.tv2.dk/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
//
//finding headers: <\s*h2[^>]*>(\n.*?)<\s*\/\s*h2>
//finding links: <\s*a[^>]*>(.*?)<\s*/\s*a>
// new line: