int nRows = 9;
int nColumns = 10;
int squares = nRows*nColumns;
int sSize = 15;
int x = 0;
int y = 0;
int clr = 1;
size(nRows*sSize,nColumns*sSize);






for(int i = 0; i < nRows; i = i + 1){
  for(int j = 0; j < nColumns; j = j + 1){
    if(clr%2==0){
      fill(0,0,0);
      rect(x,y,sSize,sSize);
      clr = clr + 1;
      }
    else{
      fill(255,255,255);
      rect(x,y,sSize,sSize);
      clr = clr + 1;
      }
      y = y + sSize;
    }
    x = x + sSize;
    y = 0;
  }


