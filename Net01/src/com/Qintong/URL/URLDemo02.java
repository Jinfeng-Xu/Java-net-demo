package com.Qintong.URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//url download
public class URLDemo02 {
    public static void main(String[] args) throws IOException {
        //下载地址
       // URL url = new URL("http://localhost:8080/Qintong/Secret.txt");
        URL url2 = new URL("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201809%2F25%2F20180925163843_SKif8.jpeg&refer=http%3A%2F%2Fb-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1628329818&t=dba6ea32f27e3560e6615b4a0aacec69");

        //连接到这个资源
       // HttpURLConnection urlConnection =(HttpURLConnection)url.openConnection();
        HttpURLConnection urlConnection2 =(HttpURLConnection)url2.openConnection();

      //  InputStream is = urlConnection.getInputStream();
        InputStream is2 = urlConnection2.getInputStream();
      //  FileOutputStream fos = new FileOutputStream("Net01/source/Secret.txt");
        FileOutputStream fos2 = new FileOutputStream("Net01/source/pig.png");

//        byte[] buffer = new byte[1024];
//        int len;
//        while((len=is.read(buffer))!=-1){
//            fos.write(buffer,0,len);
//        }
        byte[] buffer2 = new byte[1024];
        int len2;
        while((len2=is2.read(buffer2))!=-1){
            fos2.write(buffer2,0,len2);
        }
      //  fos.close();
        fos2.close();
        //is.close();
        is2.close();
       // urlConnection.disconnect();
        urlConnection2.disconnect();
    }
}
