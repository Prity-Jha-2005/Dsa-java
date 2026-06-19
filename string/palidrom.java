public class palidrom{   
public static void main(String[] args) {

String s= "madam";
String rev="";
for (int i = s.length()-1 ; i>=0; i--){
    rev= rev+s.charAt(i);
}
if(s.equals(rev)){
    System.out.print("true");

}
    else{
        System.out.println("false");
    }
}
}
//}//     String str1= "prity";
//     String str2=  "preety";
//     System.out.print(str1.equals(str2));


// String str1 = new String(prity);
// String str2 = new String(prity);

// System.out.print(str1==str2);
//.eqals() string ke andr ka content compare krta hai.jiase abhi hua interwie mw yahi 
// example denge
