class R {

  String text;
  R example;

  R(String text, R example) {
    this.text = text;
    this.example = example;
  }
}

class ExamplesR {

  R newObject = new R("testing", null);
}
// I was able to construct a R object using the null value for the example argument.
//2. It is impossible to create a reply to a reply to a tweet because of the structure of the TextTweet and ReplyTweet class. ReplyTweet class uses TextTweet as its parameter, calling on the original tweet to base the reply tweet off of. So, when constructing a replyTweet object to reply to another replyTweet, it simply can't pass through a replyTweet as its parameter, because the code only allows a TextTweet to be its parameter. So replyTweet objects will only be able to reply to the original tweet and not to each other.
