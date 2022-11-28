package HomeWork2;

public class MaxSubsequence {
    public static void main(String[] args) {
        String sequence =  "abcdeffrewwq";
        String sequence2 = "abdereopq";

        System.out.println("Общая подпоследовательность: " + getSubsequence(sequence, sequence2));
        System.out.println("Максимальная подпоследовательность: " + getSubsequence(sequence, sequence2).length());
    }

    public static String getSubsequence(String str, String str2){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0, lastIndex = 0; i < str.length(); i++) {
            for (int j = lastIndex; j < str2.length(); j++) {
                if (str.charAt(i) == str2.charAt(j)){
                    stringBuilder.append(str2.charAt(j));
                    lastIndex = j + 1;
                    break;
                }
            }
        }

        return stringBuilder.toString();
    } 
}