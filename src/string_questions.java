public class string_questions {
    public static void main(String[] args) {
      // Problem 1
        String simp = "MADHAV KhuRAna";
        simp = simp.toLowerCase();
        System.out.println(simp);

        // Problem 2
        String zap = "D U M F   RI    E  S";
        zap = zap.replace(" " , "_");
        System.out.println(zap);

        // Problem 3
        String letter = "Dear <|Name|> Thanks a lot";
        letter = letter.replace("<|Name|>","TURBULENT");
        System.out.println(letter);

        // Problem 4
        String ourString = "This  String  contains             Double and Triple Spaces";
        System.out.println(ourString.indexOf("  "));
        System.out.println(ourString.indexOf("   "));

        // Problem 5
        String gox = "Dear Vain,\n \tThis Java Course is Nice.\nThanks";
        System.out.println(gox);


    }
}
