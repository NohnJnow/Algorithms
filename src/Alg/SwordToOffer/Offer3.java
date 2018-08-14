package Alg.SwordToOffer;
//将一个字符串中的空格替换成“%20”。
//例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class Offer3 {
    public static String replace(StringBuffer str){
        if(str == null)
            return null;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length();i++)
        {
            if (String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

    public static String Replace(String input){
        StringBuilder builder = new StringBuilder();
        if(input == null || input.length()==0){
            return null;
        }else {
            for(int i =0; i < input.length();i++)
                if (input.charAt(i)==' ') {
                    builder.append("%20");
                }else{
                    builder.append('i');
                }
        }
        return builder.toString();
    }
    
    
    public static void main (String[] args) {
       Offer3 test = new Offer3();
        // 输入的字符串包含空格：最后面，最前面，中间，连续空格
        String str1 = "We are happy.";
        String str2 = " Wearehappy.";
        String str3 = "Wearehappy. ";
        String str4 = "We   are   happy  .";
        //输入的字符串没有空格
        String str5="Wearehappy.";
        //特殊输入测试：字符串只有连续空格、只有一个空格、字符串是一个null指针、字符串是一个空字符串;
        String str6="    ";
        String str7=" ";
        String str8=null;
        String str9="";
        System.out.println(test.Replace(str1));
        System.out.println(test.Replace(str2));
        System.out.println(test.Replace(str3));
        System.out.println(test.Replace(str4));
        System.out.println(test.Replace(str5));
        System.out.println(test.Replace(str6));
        System.out.println(test.Replace(str7));
        System.out.println(test.Replace(str8));
        System.out.println(test.Replace(str9));
    }
    }
