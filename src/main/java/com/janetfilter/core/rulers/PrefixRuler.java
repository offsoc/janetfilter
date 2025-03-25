package com.janetfilter.core.rulers;

public class PrefixRuler implements Ruler {
    @Override
    public boolean test(String rule, String content) {
        return content.startsWith(rule);
    }

    public String getFormattedDetails(VMDescriptor descriptor) {
        return String.format("VM Details: [ID: %s, ClassName: %s, Args: %s]", descriptor.getId(), descriptor.getClassName(), descriptor.getArgs());
    }
}
