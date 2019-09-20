package injectObjectvalues;

public class Student {
    MathCheat mathCheat;
    int id;
    //to inject object value well do setter method
    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating()
    {
        mathCheat.mathcheat();
    }
}
