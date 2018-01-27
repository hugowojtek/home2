package dequeue;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable{
    private String title;
    private LocalDate creationDate;
    private LocalDate executeDate;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(LocalDate executeDate) {
        this.executeDate = executeDate;
    }
}