package com.misaya.utils;


//SDNkMu8ZT68	w00dy911	630	People & Blogs	186	10181	3.49	494	257	rjnbgpPJUks 3IU1GyX_zio

public class ETLUtil {


    public static String getETLString(String ori){
        StringBuilder sb=new StringBuilder();

        String[] splitsArry =ori.split("\t");
        if(splitsArry.length<9) {
            return null;
        }
        splitsArry[3]=splitsArry[3].replace(" ","");

        for (int i=0;i<splitsArry.length;i++)
        {
            sb.append(splitsArry[i]);
            //相关id之前的数据
            if (i<9){
                if (i != splitsArry.length -1) {

                sb.append("\t");
            }
            }else {
            //相关id的数据
                if (i != splitsArry.length -1){
                    sb.append("&");
                }

            }

        }

        return sb.toString();
    }


}
