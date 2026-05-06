class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
      int m = boxGrid.length;
      int n = boxGrid[0].length;
      char[][] result = new char [n][m];
      for(int i=0;i<m;i++){ 
        int j=n-1;
        int count =0;
        while(j>=0){
            if(boxGrid[i][j]=='.') {
                count++;
                result[j][m-1-i]='.';
                j--;
            }
            else if(boxGrid[i][j]=='#') {
                result[j][m-1-i]='.';
                result[j+count][m-1-i]=boxGrid[i][j];
                j--;
            }                
            else {
                result[j][m-1-i]=boxGrid[i][j];
                count=0;
                j--;
            }
        }
      }
      return result;
    }
}