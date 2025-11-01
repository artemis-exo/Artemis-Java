public class string_method {
    public static void main(String[] args) {
        String entity = "VEDAANT";
        System.out.println(entity);
        int fec= entity.length();
        System.out.println(fec);

        String lstring= entity.toLowerCase();
        System.out.println(lstring);

        String upstring= entity.toUpperCase();
        System.out.println(upstring);

        String entry= "  BEWILDERED    ";       // Trim method
        String trim= entry.trim();
        System.out.println(trim);

        String substrings= entity.substring(1);
        System.out.println(substrings);

        String substring1= entity.substring(1,6);
        System.out.println(substring1);

        String replacing= entity.replace('A' , 'm');
        System.out.println(replacing);
        System.out.println(entity.replace("VED" , "NED"));
        System.out.println(entity.replace("D" , "IER"));

        System.out.println(entity.startsWith("VED"));   // STARTS WITH
        boolean bloop= entity.startsWith("VED");
        System.out.println(bloop);

        System.out.println(entity.endsWith("DAANT"));  // ENDS WITH

        int charco= entity.charAt(0);   //ASCII Value
        char charca= entity.charAt(0);  // Storing in char
        System.out.println(charco);
        System.out.println(charca);
        System.out.println(entity.charAt(5));


        int fry= entity.indexOf("ED");
        System.out.println(fry);
        System.out.println(entity.indexOf("NT"));    //Both are same 41 & 42



          String modifiedstring ="Harryrry";
//        System.out.println(modifiedstring.indexOf("rry"));
//        System.out.println(modifiedstring.indexOf("rry243"));  // No Match -1
//        System.out.println(modifiedstring.indexOf("rry" , 4));


        System.out.println(modifiedstring.lastIndexOf("rry"));
        System.out.println(modifiedstring.lastIndexOf("rry" , 4));


        System.out.println(entity.equals("Vedaant"));
        System.out.println(entity.equalsIgnoreCase("VedAant"));

        // Escape Sequence
        System.out.println("Iam Escaping the Infinity Loop \" double qouties");  // Double Quotes
        System.out.println("Iam Escaping the Infinity Loop \t Willy Willy Hurricane Typhoon"); // TAB
        System.out.println("Iam Escaping the Infinity Loop \n Willy Willy Hurricane Typhoon");  // NEW LINE
        System.out.println("Iam Escaping the Infinity Loop \f Willy Willy Hurricane Typhoon");  // FORMFEED
        // Compare To
        String name ="AksHit Sharma";
        int length= name.length();
        char c = name.charAt(length -1);
        System.out.println(c);
        String name2= "Akshit Sharma";
        String str1="remote";
        String str2= "ramote";
        int i= str2.compareTo(str1);
        System.out.println(i);
        // Empty & Blank
        String namio="Amar Panchal";
        System.out.println(namio.startsWith("Am"));
        String emp="  ";
        System.out.println(emp.isEmpty());
        System.out.println(emp.isBlank());
        int p=namio.lastIndexOf("a");
        System.out.println(p);
        System.out.println(namio.lastIndexOf("Pan"));
        System.out.println(namio.indexOf("a",5));
        System.out.println(namio.substring(2,8));
        System.out.println(namio.subSequence(2,8));
















    }
}
