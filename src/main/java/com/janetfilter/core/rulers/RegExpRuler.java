package com.janetfilter.core.rulers;

import java.util.regex.Pattern;

public class RegExpRuler implements Ruler {
    @Override
    public boolean test(String rule, String content) {
        return Pattern.matches(rule, content);
    }

    public String getFormattedDetails(VMDescriptor descriptor) {
        return String.format("VM Details: [ID: %s, ClassName: %s, Args: %s]", descriptor.getId(), descriptor.getClassName(), descriptor.getArgs());
    }
}
