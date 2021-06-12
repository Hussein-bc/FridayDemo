public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        int length = word.length();
        for (int i = 1; i < length; i++) {
            char ch = word.charAt(i);
            if ('A' <= ch  && ch <= 'Z') {
                return false;
            }
        }
        return true;
    }


    }



