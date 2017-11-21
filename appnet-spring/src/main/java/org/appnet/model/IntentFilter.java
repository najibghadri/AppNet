package org.appnet.model;

public class IntentFilter {
    String action;
    String data;
    String mimeType;
    String category;

    public String getAction() {
        return action;
    }

    public IntentFilter setAction(String action) {
        this.action = action;
        return this;
    }

    public String getData() {
        return data;
    }

    public IntentFilter setData(String data) {
        this.data = data;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public IntentFilter setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public IntentFilter setCategory(String category) {
        this.category = category;
        return this;
    }
}
