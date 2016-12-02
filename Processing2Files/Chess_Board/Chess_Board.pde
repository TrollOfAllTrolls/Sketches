void setup(){
 int nRows = 10;
 int nColumns = 10;
 int sSize = 50;
 int x = 0;
 int y = 0;
 int cNum = 255;
 int cNumFirst;
 
 size(sSize * nColumns, sSize * nRows);
 noStroke();
 
 for(int i = 0; i < nRows; i++){
   cNumFirst = cNum;
   
   for(int j = 0; j < nColumns; j++){
     fill(cNum,cNum,cNum);
     rect(x, y, sSize, sSize);
     
     if(cNum == 255){
       cNum = 0;
     }
     else{
       cNum = 255;
     }
     
     x += sSize;
   }
   
   if(cNumFirst == 255){
     cNum = 0;
   }
   else{
     cNum = 255; 
   }
   
   x = 0;
   y += sSize;
 }
}
