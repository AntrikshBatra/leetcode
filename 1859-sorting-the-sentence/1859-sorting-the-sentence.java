class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[9];
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (!Character.isDigit(temp) && !Character.isWhitespace(temp)){
                sb.append(temp);
            } else if (Character.isDigit(temp)) {
                int index = Integer.parseInt(String.valueOf(temp));
                arr[index-1] = sb.toString();
                sb.delete(0,sb.length());
            }
        }
        sb.delete(0,sb.length());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sb.append(arr[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}