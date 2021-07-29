package api.g;

/*
 * Since Java 15 text blocks are allowed to print text as is, starting with """ followed by a new line
 * The ending """ can be done right after the last character.
 * There is limit to what can be written (quotes, slashes...)
 * It can be formatted with .formatted
 */

public class TextBlocksRunner {

    public static void main(String[] args) {
	String str = """
				Line1
		Line2
			Line3
			""";
	System.out.print(str);
	System.out.print("""
		line1
		line2 + %s
		line3 + %d
		""".formatted("Other text", 54));

    }

}
