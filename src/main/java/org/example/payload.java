package org.example;

public class payload {

    public static String courceDetail(){
        return "\n" +
                "{\n" +
                "  \"dashboard\":{\n" +
                "    \"purchaseAmount\":\"500\",\n" +
                "    \"website\":\"https://books.com\"\n" +
                "  },\n" +
                "  \"courses\":\n" +
                "  [\n" +
                "    {\n" +
                "      \"title\":\"selenium\",\n" +
                "      \"price\":\"200\",\n" +
                "      \"copies\":\"5\"\n" +
                "    },\n" +
                "     {\n" +
                "      \"title\":\"python\",\n" +
                "      \"price\":\"150\",\n" +
                "      \"copies\":\"5\"\n" +
                "    },\n" +
                "     {\n" +
                "      \"title\":\"playwright\",\n" +
                "      \"price\":\"150\",\n" +
                "      \"copies\":\"5\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
}
