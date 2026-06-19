public class count{
    public static void main(String[] arg){
        String check= "Edcation";
   int count =0;
        for(int i = 0; i< check.length();  i++){

char ch= check.charAt(i);
if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ){
    count++ ;
}
        }
    System.out.print(count);




        }




    }
