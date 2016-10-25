package com.alexzetor;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {

    public static void main(String[] args) throws Exception{
        int c;
        String URL;
        int PORT;

        //Socket s = new Socket(URL, PORT);
        Socket s = new Socket("whois.2ip.ru", 80);

        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();


        String str = (args.length == 0 ? "yandex.ru" : args[0]) + "\n";

        byte buf[] = str.getBytes();
         out.write(buf);

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
