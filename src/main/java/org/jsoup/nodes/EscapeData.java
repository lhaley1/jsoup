package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

import static org.jsoup.nodes.Document.OutputSettings.*;
import static org.jsoup.nodes.Entities.EscapeMode.base;
import static org.jsoup.nodes.Entities.EscapeMode.extended;
public class EscapeData {
    private final OutputSettings out;
    private final boolean inAttribute;
    private final boolean normaliseWhite;
    private final boolean stripLeadingWhite;
    private final boolean trimTrailing;

    public EscapeData(OutputSettings out, boolean inAttribute, boolean normaliseWhite,
                          boolean stripLeadingWhite, boolean trimTrailing) {
        this.out = out;
        this.inAttribute = inAttribute;
        this.normaliseWhite = normaliseWhite;
        this.stripLeadingWhite = stripLeadingWhite;
        this.trimTrailing = trimTrailing;
    }

    public OutputSettings getOut() {
        return out;
    }

    public boolean isInAttribute() {
        return inAttribute;
    }

    public boolean isNormaliseWhite() {
        return normaliseWhite;
    }

    public boolean isStripLeadingWhite() {
        return stripLeadingWhite;
    }

    public boolean isTrimTrailing() {
        return trimTrailing;
    }
}

