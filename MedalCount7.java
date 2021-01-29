public class MedalCount7 {
    final int COUNTRIES = 7;
    final int MEDALS = 3;

    private int[][] counts = new int[][]
            {
                    {1,0,1},
                    {1,1,0},
                    {0,1,0},
                    {1,1,0},
                    {0,1,1},
                    {0,0,0},
                    {1,1,1}
            };
    public MedalCount7(){


    }
    public void printTable(){
        for(int row = 0; row < this.counts.length;row++){
            for(int col = 0;col <MEDALS ;col++){
                System.out.println(this.counts[row][col] + "\t");

            }
            System.out.println();
        }

    }
    public int sumMedalsForCountry(int countryIndex){
        int sum = 0;

        for(int col = 0; col < this.counts[countryIndex].length;col++){
            sum += this.counts[countryIndex][col];
        }

        return sum;
    }

    public int sumMedalsForType(int medalIndex){
        int sum = 0;

        for(int row = 0; row < this.counts.length; row++){
            sum += this.counts[row][medalIndex];
        }
        return sum;

    }

}
