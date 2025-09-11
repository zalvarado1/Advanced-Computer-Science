public class Skeleton {
    // the 'this' keyword
    private String boneColor;
    private int boneCount;
    private int bestByYear;

    public Skeleton() {
        boneColor = "white";
        boneCount = 206;
        bestByYear = 2905;
    }

    public Skeleton(String boneColor, int boneCount, int bestByYear) {
        this.boneColor = boneColor;
        this.boneCount = boneCount;
        this.bestByYear = bestByYear;
    }

    public String getBoneColor() {
        return boneColor;
    }
    
    public void setBoneColor(String boneColor) {
        //instance variable is assigned to the local input boneColor
        this.boneColor = boneColor;
    }

    public boolean equals(Skeleton other){
        return this.boneColor.equals(other.boneColor) && this.boneCount == other. boneCount
        && this.bestByYear == other.bestByYear;
    }
}
