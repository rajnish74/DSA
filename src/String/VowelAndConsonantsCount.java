package String;

public class VowelAndConsonantsCount {



    public static void countVowelAndConsonants(){
        String str="hello world";
        int vowelCount=0;
        int consCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowelCount++;
            }else {
                if (Character.isLetter(ch)){
                    consCount++;
                }

            }
        }
        System.out.println("vowel is " +vowelCount);
        System.out.println("cons is "+consCount);
    }


    public static void main(String[] args) {
        countVowelAndConsonants();
    }
}
