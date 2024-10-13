import java.util.*;

class program677

{
    public static void main (String arg[])
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");
       
        String Arr[] = str.split(" "); 

        HashMap  <String, Integer> hobj= new HashMap<String, Integer>();


        int frequency = 0;
        for (String a: Arr)//hashmap chya object mdhe jaun check kraych ki mjha character ahe ka ni 
        {
            if(hobj.containsKey(a))
            {
                frequency = hobj.get(a);
                hobj.put(a,frequency+1);//asel tr add kr
            }
            else 
            {
                hobj.put(a,1);
            }
        }

        Set <String> setobj = hobj.keySet();

        //occurs maximum number of times

        int imax =0;
        String temp = null;
        for(String B : setobj)
        {
            if( hobj.get(B) >imax)
            {
                imax = hobj.get(B);
                temp = B;
            }
        }

        System.out.println(temp + " is a word which occurs maximum number of times ");
    }   
}

