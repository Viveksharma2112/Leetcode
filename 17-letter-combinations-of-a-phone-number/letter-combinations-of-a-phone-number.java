

        class Solution {

    String[] map = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return result;

        backtrack(digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path) {

        // base case
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {

            // choose
            path.append(ch);

            // explore
            backtrack(digits, index + 1, path);

            // un-choose
            path.deleteCharAt(path.length() - 1);
        }
    }
}

