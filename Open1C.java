class Open1C {
    TestC c = new TestC();
    int value = c.test1(10,10);
    boolean value2 = c.test2(5,10);
}

class TestC {
    int test1(int a, int b) {
        return a + b;
    }

    boolean test2(int a, int b) {
        if(a == b) {
            return true;
        }
        else {return false;}
    }
}

/*Tester Library v.3.0
-----------------------------------
Tests defined in the class: Open1C:
---------------------------
Open1C:
---------------
new Open1C:1(
 this.c = new TestC:2()
 this.value = 20
 this.value2 = false)
---------------
No test methods found. */