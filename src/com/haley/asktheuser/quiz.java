package com.haley.asktheuser;

public class quiz {
    private byte numberOfDogs;
    private short numberOfFruits;
    private int cityPopulation;
    private float piToTheTenth;
    private long americaPopulation;
    public double freezeTemp;
    private boolean bananaColor;
    private String currentPresident;


    public quiz(byte numberOfDogs, short numberOfFruits, int cityPopulation, float piToTheTenth, long americaPopulation, double freezeTemp,  boolean bananaColor, String currentPresident){
    this.numberOfDogs = numberOfDogs;
    this.numberOfFruits = numberOfFruits;
    this.cityPopulation = cityPopulation;
    this.piToTheTenth = piToTheTenth;
    this.americaPopulation= americaPopulation;
    this.freezeTemp = freezeTemp;
    this.bananaColor= bananaColor;
    this.currentPresident= currentPresident;
}
public byte getNumberOfDogs(){
    return numberOfDogs;
    }

public void setNumberOfDogs(byte numberOfDogs){
    this.numberOfDogs=numberOfDogs;
    }

public short getNumberOfFruits(){
    return numberOfFruits;
    }

public void setNumberOfFruits(short numberOfFruits){
    this.numberOfFruits= numberOfFruits;
}

public int getCityPopulation(){
        return cityPopulation;}

public void setCityPopulation(int cityPopulation){
        this.cityPopulation= cityPopulation;}

public float getPiTotheTenth(){
        return piToTheTenth;}

public void setPiToTheTenth(float piToTheTenth){
        this.piToTheTenth= piToTheTenth;}

    public long getAmericaPopulation(){
        return americaPopulation;
    }

    public void setAmericaPopulation(long americaPopulation){
        this.americaPopulation= americaPopulation;
    }

    public double getFreezeTemp(){
        return freezeTemp;
    }

    public void setFreezeTemp(double freezeTemp){
        this.freezeTemp= freezeTemp;}

    public boolean getBananaColor(){
        return bananaColor;}

    public void setBananaColor(boolean bananaColor){
        this.bananaColor= bananaColor;}


    public String getCurrentPresident(){
        return currentPresident;}

    public void setCurrentPresident(String currentPresident){
        this.currentPresident= currentPresident;}}





