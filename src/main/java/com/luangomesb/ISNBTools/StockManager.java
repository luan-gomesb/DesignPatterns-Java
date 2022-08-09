package com.luangomesb.ISNBTools;

public class StockManager {
    ExternalISBNDataService service;

    public void setService(ExternalISBNDataService service) {
        this.service = service;
    }

    public String getLocatorCode(String isbn) {
        Book book = service.lookup(isbn);
        StringBuilder locator = new StringBuilder();
        locator.append(book.getIsbn().substring(book.getIsbn().length()-4));
        locator.append(book.getAuthor().substring(0,1));
        locator.append(book.getTitle().split(" ").length);
        return locator.toString();
    }
}
