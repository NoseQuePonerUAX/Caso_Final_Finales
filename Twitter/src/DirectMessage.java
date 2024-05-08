public class DirectMessage extends Tweet {
    private UserAccount recipient;

    public DirectMessage(UserAccount author, UserAccount recipient, String content) {
        super(author, content);
        this.recipient = recipient;
    }

    public UserAccount getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "[" + time + "] DM from @" + author.getAlias() + " to @" + recipient.getAlias() + ": " + content;
    }
}
