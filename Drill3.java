class TextTweet {
    String contents;
    int likes;

    TextTweet(String contents, int likes) {
        this.contents = contents;
        this.likes = likes;
    }

    boolean hasMention(String username) {
        String s2 = this.contents + " ";
        String subString = "@" + username + " ";
        if(s2.contains(subString)) {
            return true;
        }
        return false;
    }

    boolean hasLike() {
        if(likes > 0) {
            return true;
        }
        return false;
    }

    String firstMention() {
        int index = contents.indexOf('@');
        int spaceIndex = contents.indexOf(' ', index);
        if(index == -1 || spaceIndex == -1) {
            return "";
        }
        else {return contents.substring(index + 1, spaceIndex);}
    }
}

class ReplyTweet {
    TextTweet replyTo;
    String contents;
    int likes;

    ReplyTweet(TextTweet replyTo, String contents, int likes) {
        this.replyTo = replyTo;
        this.contents = contents;
        this.likes = likes;
    }
    boolean morePopularReply() {
        if(this.likes > replyTo.likes) {
            return true;
        }
        else {return false;}
    }

    int allLikes() {
        return this.likes + replyTo.likes;
    }

    boolean hasMention(String username) {
        if(this.contents.contains("@" + username + " ") || replyTo.contents.contains("@" + username + " ")) {
            return true;
        }
        else {return false;}
    }
}