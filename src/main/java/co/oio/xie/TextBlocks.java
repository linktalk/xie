/*
 * Copyright 2020 Xuelei.Fan@OIO.CO.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */
package co.oio.xie;

/**
 * Samples for text block (JEP 378).
 */
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