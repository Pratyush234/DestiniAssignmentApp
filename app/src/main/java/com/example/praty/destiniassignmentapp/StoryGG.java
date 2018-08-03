package com.example.praty.destiniassignmentapp;

public class StoryGG {
    private int quesID;
    private int ans1ID;
    private int ans2ID;
    public StoryGG(int questionID, int answer1ID, int answer2ID){
        quesID=questionID;
        ans1ID=answer1ID;
        ans2ID=answer2ID;

    }

    public int getQuesID() {
        return quesID;
    }

    public void setQuesID(int quesID) {
        this.quesID = quesID;
    }

    public int getAns1ID() {
        return ans1ID;
    }

    public void setAns1ID(int ans1ID) {
        this.ans1ID = ans1ID;
    }

    public int getAns2ID() {
        return ans2ID;
    }

    public void setAns2ID(int ans2ID) {
        this.ans2ID = ans2ID;
    }
}
