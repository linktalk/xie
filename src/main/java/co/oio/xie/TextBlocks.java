package co.oio.xie;

public class TextBlocks {
    public static void main(String[] args) {
        String stringBlock =
                "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <body>\n" +
                "        <h1>Hello World!</h1>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println("The regular string code:\n" + stringBlock);

        String textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>Hello World!</h1>
                    </body>
                </html>
                """;
        System.out.println("The text block code:\n" + textBlock);
        System.out.println("Is the test block equals to the regular string? " +
                stringBlock.equals(textBlock));

        textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>Hello World!</h1>
                    </body>
                </html>
            """;
        System.out.println("The text block code:\n" + textBlock);
        System.out.println("Is the test block equals to the regular string? " +
                stringBlock.equals(textBlock));

        textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>"Hello World!"</h1>
                    </body>
                </html>
                """;
        System.out.println("The text block code:\n" + textBlock);
        System.out.println("Is the test block equals to the regular string? " +
                stringBlock.equals(textBlock));

        textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>Hello \
                World!</h1>
                    </body>
                </html>
                """;
        System.out.println("The text block code:\n" + textBlock);
        System.out.println("Is the test block equals to the regular string? " +
                stringBlock.equals(textBlock));

        int size = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>Hello \
                World!</h1>
                    </body>
                </html>
                """.length();
        System.out.println("The size of the text block code is: " + size);

        textBlock = """
                <!DOCTYPE html>
                <html>
                    <body>
                        <h1>%s</h1>
                    </body>
                </html>
                """.formatted("Hello World!");
        System.out.println("The text block code:\n" + textBlock);
        System.out.println("Is the test block equals to the regular string? " +
                stringBlock.equals(textBlock));
    }
}