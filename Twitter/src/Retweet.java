public class Retweet extends Tweet {
    private Tweet originalTweet;

    public Retweet(UserAccount author, Tweet originalTweet) {
        super(author, "RT: " + originalTweet.getContent());
        this.originalTweet = originalTweet;
    }

    public Tweet getOriginalTweet() {
        return originalTweet;
    }

    @Override
    public String toString() {
        return "[" + time + "] @" + author.getAlias() + ": RT @" + originalTweet.getAuthor().getAlias() + ": " + originalTweet.getContent();
    }
}
