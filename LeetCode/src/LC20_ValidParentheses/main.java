package LC20_ValidParentheses;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		ValidParentheses_noInputConst ValidParentheses_noInputConst1 = new ValidParentheses_noInputConst();
		ValidParentheses ValidParentheses1 = new ValidParentheses();
		
		//no input constraints
		String s1 = "12((3";
		String s2 = "12((3))";
		String s3 = "12([{3}])";
		String s4 = "12([{3]})";
		String s5 = ")"; //false
		
		//with input constraints
		String b1 = "(";
		String b2 = "(())";
		String b3 = "([{}])";
		String b4 = "([{]})";
		String b5 = ")"; //false
		
//		System.out.println(ValidParentheses_noInputConst1.ValidParentheses(s2));
		System.out.println(ValidParentheses1.ValidParentheses(b2));

	}

}
