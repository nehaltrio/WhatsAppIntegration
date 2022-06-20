package com.example.whatsappintegration.Models;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlProcess {

    public String buildSafeURL(String partialURL, String documentName) throws UnsupportedEncodingException {

        String urlSafeDocumentName = URLEncoder.encode(documentName,
                java.nio.charset.StandardCharsets.UTF_8.toString()).replaceAll("\\+", "%20");

        return partialURL + urlSafeDocumentName;
    }


}
