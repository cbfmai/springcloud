package com.mmnet.crawlerclient.spel;

import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpelTest1 {

    @Test
    public void test1() {
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello World'");
        String message = (String) exp.getValue();
        System.out.println(message);
    }

    @Test
    public void testStringFilter() {
        String s = "根据号码[13923083216]运营商提供的认证时间,推算该号码使用97个月";

        String input ="{\"ProductCode\":\"8CBE1F526BE144419083D25720106D0E\",\"OrgID\":\"AB5EC46E84F34EFD82673A55D0F97972\",\"KeyValue\":\"张玲\",\"PageSize\":\"50\",\"PageIndex\":\"0\"}";

       // String s = new String("Str87uyuy232");
        //String s = input.
        Matcher matcher = Pattern.compile("\\d+").matcher(s.split(",")[1]);
        matcher.find();
        String value = matcher.group();
        System.out.println(value);
    }


}
