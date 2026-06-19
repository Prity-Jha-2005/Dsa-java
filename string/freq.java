public class freq {
public static void main(String[] args) {
String str= "banana" ;
 int count =0;


for(int i =0; i < str.length(); i++){
char ch= str.charAt(i);
            if(ch =='a'){
            count ++  ;
            }
         }
         System.out.print(count);
    }
    
}
