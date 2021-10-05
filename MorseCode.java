public class MorseCode {

 public static  String morseEncode(char x)
 {
     switch (x)
     {
         case 'a' :
             return ".-";
         case  'b':
             return  "-...";
         case 'c':
             return  "-.-.";
         case 'd':
             return  "-..";
         case 'e':
             return  ".";
         case 'f':
             return  "..-.";
         case 'g':
             return  "--.";
         case 'h':
             return  "....";
         case 'i':
             return  "..";
         case 'j':
             return  ".---";
         case 'k':
             return  "-.-";
         case 'l':
             return  ".-..";
         case 'm':
             return  "--";
         case 'n':
             return  "-.";
         case 'o':
             return  "---";
         case 'p':
             return  ".--.";
         case 'q':
             return  "--.-";

         case 'r':
             return  ".-.";
         case 's':
             return  "...";
         case 't':
             return  "-";
         case 'u':
             return  "..-";
         case 'v':
             return  "...-";
         case 'w':
             return  ".--";
         case 'x':
             return  "-..-";
         case 'y':
             return  "-.--";
         case 'z':
             return  "--..";

     }
     return "";
 }

    public static  void morsecode(String s)
    {
        for(int i=0;i<s.length();i++)
        {
          System.out.print(morseEncode(s.charAt(i)));

        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence need to convert into morse code");
        String enter=sc.next();
        morsecode(enter);
    }
}
