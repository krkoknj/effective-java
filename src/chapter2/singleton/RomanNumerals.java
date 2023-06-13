package chapter2.singleton;

import java.util.regex.Pattern;

public class RomanNumerals {
    // 메소드가 호출될 때 마다 Pattern 객체 생성.
    static boolean isRomanNumeralSlow(String s) {
                                                        // 패턴 객체 생성
        //public boolean matches(String regex) {return Pattern.matches(regex, this);}
        
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
    
    // 미리 생성해둔 Pattern 객체 재사용
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }
}
