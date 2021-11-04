package Package_02;
/*
* SimpleDateFormat类概述
* SimpleDateFormat是一个具体的类，用于以区域设置敏感的方式格式和解析日期。我们重点学习日期格式化和解析
*
* 日期和时间格式有日期和时间模式字符串指定，在日期和时间模式字符串中从'A'到'Z'以及从'a'
* 到'z'引号的字母被解释为表示日期或时间字符串的组件的模式字母
*
* 常用的模式字母及对应关系如下：
* y     年
* M     月
* d     日
* H     时
* m     分
* s     秒
*
* yyyy-mm-dd;  HH:mm:ss;
*
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*构造方法：public SimpleDateFormat():构造一个SimpleDateFormat,使用默认模式和日期
*         public SimpleDateFormat(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式
*
* 格式化：从Date 到 String
*   public final String format(Date date):将日期格式化成日期/时间字符串
*
* 解析：从String到Date
*   public Date parse(String source):从给定字符串的开始解析文本以生成日期  */
public class SeptemberTwentyFive_03 {
    public static void main(String[] args) throws ParseException {
        //格式化:从Date 到 String
        Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);



        //解析：从String到Date
        String ss ="2021-8-25 21:18:18";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(ss);
        System.out.println(d2);
    }
}
