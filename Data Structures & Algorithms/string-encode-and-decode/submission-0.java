class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

    for (String str : strs) {
        encoded.append(str.length()).append("#").append(str);
    }

    return encoded.toString();

    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

    int i = 0;

    while (i < s.length()) {

        int j = i;

        // find '#'
        while (s.charAt(j) != '#') {
            j++;
        }

        int length = Integer.parseInt(s.substring(i, j));

        String word = s.substring(j + 1, j + 1 + length);

        result.add(word);

        i = j + 1 + length;
    }

    return result;

    }
}
