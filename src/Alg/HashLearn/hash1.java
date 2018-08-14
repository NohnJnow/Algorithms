package Alg.HashLearn;
//关键字是字符串时，用字符串的asc码值相加来当哈希值
public class hash1 {
        public static  int hash (String key,int tableSize){
            int hashVal = 0;
            for(int i = 0; i<key.length();i++)
                hashVal += key.charAt(i);
            return hashVal % tableSize;
        }
}
