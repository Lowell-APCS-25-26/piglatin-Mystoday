package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        if(sWord.length()>2 && sWord.substring(0,2).equals("qu")){
            return 2;
         }
        for (int i=0;i<sWord.length();i++){
    if(sWord.substring(i,i+1).equals("a") || sWord.substring(i,i+1).equals("e") 
    ||sWord.substring(i,i+1).equals("i") || sWord.substring(i,i+1).equals("o") 
    ||sWord.substring(i,i+1).equals("u")){
      return i;
    }
  }
  return -1;
}


    public String pigLatin(String sWord) {
        
        int a=findFirstVowel(sWord);
      
        if(a>0){
       return sWord.substring(a) + sWord.substring(0,a) + "ay";
    }
      
       if(a==0){
       return sWord + "way";
    }
       return sWord + "ay";
    }
}
