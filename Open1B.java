class Open1B {
    TestB1 B1 = new TestB1();
}

class TestB1 {
    int likes;
    boolean likes;
}
/* error: Open1B.java:7: error: variable likes is already defined in class TestB1
    boolean likes;
            ^
1 error */