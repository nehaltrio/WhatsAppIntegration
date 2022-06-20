package com.example.whatsappintegration.Models;

import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.net.URI;

public class WhatsappData {
    public String wpNum;
    public String wpText;

    public WhatsappData(String wpNum, String wpText) {
        super();
        this.wpNum = wpNum;
        this.wpText = wpText;
    }

    public WhatsappData() {
        super();
    }

    public String getWpNum() {
        return wpNum;
    }

    public void setWpNum(String wpNum) {
        this.wpNum = wpNum;
    }

    public String getWpText() {
        return wpText;
    }

    public void setWpText(String wpText) {
        this.wpText = wpText;
    }

    public String wpUrl() throws UnsupportedEncodingException {

        String partialURL = "https://wa.me/88"+ getWpNum() +  "?text=";
        UrlProcess urlProcess = new UrlProcess();
        return urlProcess.buildSafeURL(partialURL, getWpText());

    }

    public  boolean openWebpage() throws UnsupportedEncodingException {
        URI uri = URI.create(wpUrl());

        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(uri);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
