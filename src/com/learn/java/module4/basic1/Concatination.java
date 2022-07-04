package com.learn.java.module4.basic1;

class StringConcatenation {
    private String firstPhrase;

    public String getSecondPhrase() {
        return secondPhrase;
    }

    public void setSecondPhrase(String userPhrase2) {
        if(userPhrase2.isEmpty()){
            System.out.println("You haven't entered Second Phrase");
        } else {
        this.secondPhrase = userPhrase2;}
    }

    private String secondPhrase;

    public String getThirdPhrase() {
        return thirdPhrase;
    }

    public void setThirdPhrase(String userPhrase3) {
        this.thirdPhrase = userPhrase3;
    }

    private String thirdPhrase;

    public void setFirstPhrase(String userPhrase1) {
        if(userPhrase1.isEmpty()){
            System.out.println("You haven't entered First Phrase");
        } else {
        firstPhrase = userPhrase1;}
    }

    public String getFirstPhrase() {
        return firstPhrase;
    }

    public void concatTwoStrings() {
        this.thirdPhrase = firstPhrase.concat(" ").concat(secondPhrase);
        System.out.println(this.thirdPhrase.replace("P", ""));
    }
}
