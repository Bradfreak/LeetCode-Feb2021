//Roman to Integer
class Solution {
    public int romanToInt(String s) {
        int len = s.length(), sum = 0, last = 1001, pres = 0, i;
        char[] str = s.toCharArray();
        for(i = 0; i < len; i++){
            switch(str[i]){
                case 'M':
                    pres = 1000;
                    break;
                case 'D':
                    pres = 500;
                    break;
                case 'C':
                    pres = 100;
                    break;
                case 'L':
                    pres = 50;
                    break;
                case 'X':
                    pres = 10;
                    break;
                case 'V':
                    pres = 5;
                    break;
                case 'I':
                    pres = 1;
                    break;
            }
            if(pres <= last){
                sum += pres;
                last = pres;
            }
            else{
                sum = sum - last + pres - last;
                last = pres - last;
            }
        }
        return sum;
    }
}
