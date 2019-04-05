package org.cql.ast.listener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dhananjay
 */
public class StringOperations {

    public static String getFileAsString(File f) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader fileData = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = fileData.readLine()) != null) {
                builder.append(line).append("\n");
            }
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Error reading " + f.getName());
        }
        return builder.toString();
    }

    public static String removeComments(String cql) {
        cql = cql.replaceAll("/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/", ""); // multi-line
        cql = cql.replaceAll("//.*", ""); // single-line
        return cql;
    }

    public static String trimHead(String cql) {
        String[] temp = cql.split("define");
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < temp.length; ++i) {
            builder.append("define").append(temp[i]);
        }
        return builder.toString();
    }

    private static String hasRetrieve(String expression) {
        String ret = null;
        Pattern p = Pattern.compile("\\s+\\[.*\\]");
        Matcher m = p.matcher(expression);
        if (m.find()) {
            ret = m.group().contains(":") ? m.group().split(":")[0].replace("[", "")
                                          : m.group().replace("[", "").replace("]", "");
        }
        return ret;
    }

    public static HashMap<String, String> getRetrieves(String cql) {
        HashMap<String, String> retrieves = new HashMap<>();
        for (String s : cql.split("define")) {
            String name = s.split(":")[0].trim();
            String resource;
            if ((resource = hasRetrieve(s)) != null) {
                retrieves.put(name, resource.trim());
            }
        }
        return retrieves;
    }

    public static HashMap<String, String> getExpressions(String cql) {
        String[] s = cql.split("define");
        HashMap<String, String> expressions = new HashMap<>();
        for (String expression : s) {
            if (expression.isEmpty()) continue;
            String name = expression.split(":")[0];
            expressions.put(name.trim(), expression.replace(name + ":", "").trim());
        }
        return expressions;
    }

    public static HashMap<String, String> getExpressionReturnTypes(String cql) {
        HashMap<String, String> expressions = getExpressions(cql);
        HashMap<String, String> returnTypes = getRetrieves(cql);
        for (String expression : expressions.keySet()) {
            String temp = expression;
            if (returnTypes.containsKey(temp)) continue;
            for (String name : expressions.keySet()) {
                if (expressions.get(temp).contains(name)) {
                    temp = name;
                    break;
                }
            }
            if (temp.equals(expression)) continue;
            returnTypes.put(expression, returnTypes.get(temp));
        }
        return returnTypes;
    }
}
