class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s; //join the given string with itself so as to find the given pattern in it
        return doubled.contains(goal);
    }
}