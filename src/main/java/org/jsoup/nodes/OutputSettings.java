//package org.jsoup.nodes;
//
//import org.jsoup.Jsoup;
//import org.jsoup.helper.Validate;
//import org.jsoup.internal.StringUtil;
//
//import java.nio.charset.Charset;
//
//public class OutputSettings extends Document {
//
//
//    /**
//     * Create a new, empty Document.
//     *
//     * @param baseUri base URI of document
//     * @see Jsoup#parse
//     * @see #createShell
//     */
//    public OutputSettings(String baseUri) {
//        super(baseUri);
//    }
//
//    public String title() {
//        // title is a preserve whitespace tag (for document output), but normalised here
//        Element titleEl = head().selectFirst(titleEval);
//        return titleEl != null ? StringUtil.normaliseWhitespace(titleEl.text()).trim() : "";
//    }
//
//    public void title(String title) {
//        Validate.notNull(title);
//        Element titleEl = head().selectFirst(titleEval);
//        if (titleEl == null) // add to head
//            titleEl = head().appendElement("title");
//        titleEl.text(title);
//    }
//
//    public void charset(Charset charset) {
//        updateMetaCharsetElement(true);
//        outputSettings.charset(charset);
//        ensureMetaCharsetElement();
//    }
//}
//
