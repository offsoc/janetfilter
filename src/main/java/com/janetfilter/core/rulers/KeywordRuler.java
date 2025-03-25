package com.janetfilter.core.rulers;

public class KeywordRuler implements Ruler {
    @Override
    public boolean test(String rule, String content) {
        return content.contains(rule);
    }

    public String getFormattedDetails(VMDescriptor descriptor) {
        return String.format("VM Details: [ID: %s, ClassName: %s, Args: %s]", descriptor.getId(), descriptor.getClassName(), descriptor.getArgs());
    }
}
