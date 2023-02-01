class R {
    String text;
    R example;

    R(String text, R example) {
        this.text = text;
        this.example = example;
    }
}

class ExamplesR {
    R newObject = new R("testing", error);
}

// 1. I was not able to construct an R object because inside class R, it calls on another R object as its parameter. This would be impossible create as you need a initial R object to create a new object, which will be a infinite loop of not being able to create an object.

//2. It is impossible to create a reply to a reply to a tweet because of the structure of the TextTweet and ReplyTweet class. ReplyTweet class uses TextTweet as its parameter, calling on the original tweet to base the reply tweet off of. So, when constructing a replyTweet object to reply to another replyTweet, it simply can't pass through a replyTweet as its parameter, because the code only allows a TextTweet to be its parameter. So replyTweet objects will only be able to reply to the original tweet and not to each other.
