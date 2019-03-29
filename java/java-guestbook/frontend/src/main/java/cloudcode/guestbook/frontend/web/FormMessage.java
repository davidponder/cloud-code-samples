package cloudcode.guestbook.frontend.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormMessage {

    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private String author = "";
    private String message = "";
    private String date = this.dateFormat.format(new Date());

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate(){
        return this.date;
    }
}