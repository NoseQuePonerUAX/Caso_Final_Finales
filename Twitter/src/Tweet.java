import java.time.LocalDate;

public class Tweet {
    protected UserAccount author;
    protected LocalDate time;
    protected String content;

    public Tweet(UserAccount author, String content) {
        this.author = author;
        this.content = content;
        this.time = LocalDate.now();
    }

    public String getContent() {
        return content;
    }

    public UserAccount getAuthor() {
        return author;
    }

    public LocalDate getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "[" + time + "] @" + author.getAlias() + ": " + content;
    }
}
