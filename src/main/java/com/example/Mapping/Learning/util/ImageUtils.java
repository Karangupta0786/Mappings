package com.example.Mapping.Learning.util;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;

public class ImageUtils {

    public static byte[] compressImage(byte[] data) throws Exception {
        Deflater deflater = new Deflater();
        deflater.setLevel(Deflater.BEST_COMPRESSION);
        deflater.setInput(data);
        deflater.finish();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(data.length);
        byte[] temp = new byte[4*1024];

        while (!deflater.finished()) {
            int size = deflater.deflate(temp);
            byteArrayOutputStream.write(temp,0,size);
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();

    }

}
