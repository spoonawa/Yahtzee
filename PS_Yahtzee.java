import java.util.Scanner;

public class PS_Yahtzee
{
     
private  int[] roll = new int[5];//declares integer array with size of 5

    public PS_Yahtzee (int rolls [])//constructor
  {
    for (int kw=0; kw<5; kw++)//sets array as equal
    {
      roll[kw]=rolls[kw];
    }
  }
  

  
 
 public int threekind (int rolls [])
  {
    int threeres=0;
    int[] threecheck = {0,0,0,0,0,0};
    for (int y=0; y<5; y++)//fills new array with amount of numbers of each dice roll value
    {
      if (roll[y]==1)//adds to designated element if specific value is matched
      {threecheck [0]+=1;}
      
      if (roll[y]==2)//adds to designated element if specific value is matched
      {threecheck [1]+=1;}
      
      if (roll[y]==3)//adds to designated element if specific value is matched
      {threecheck [2]+=1;}
      
      if (roll[y]==4)//adds to designated element if specific value is matched
      {threecheck [3]+=1;}
      
      if (roll[y]==5)//adds to designated element if specific value is matched
      {threecheck [4]+=1;}
      
      if (roll[y]==6)//adds to designated element if specific value is matched
      {threecheck [5]+=1;}
    }
    boolean tcheck=false;//sets variable
   for (int threechecks=0; threechecks<6; threechecks++)//checks if a value is rolled 3 times
   {
     if ((threecheck[threechecks])>=3)//checks for value
     {tcheck=true;//changes variable
     break;}//ends loop
   }
    if (tcheck==true)//if variable was changed
    {
    for (int e=0; e<5; e++)//for loop which runs for values in the array
     {
       {threeres+=roll[e];}//calculates sum of array's values
     }
    }
    return threeres;//returns result
 }
 

 
 


  public int fourkind (int rolls [])
  {
    int fourres=0;
    int[] fourcheck = {0,0,0,0,0,0};
    for (int u=0; u<5; u++)//fills new array with amount of numbers of each dice roll value
    {
      if (roll[u]==1)//adds to designated element if specific value is matched
      {fourcheck [0]+=1;}
      
      if (roll[u]==2)//adds to designated element if specific value is matched
      {fourcheck [1]+=1;}
      
      if (roll[u]==3)//adds to designated element if specific value is matched
      {fourcheck [2]+=1;}
      
      if (roll[u]==4)//adds to designated element if specific value is matched
      {fourcheck [3]+=1;}
      
      if (roll[u]==5)//adds to designated element if specific value is matched
      {fourcheck [4]+=1;}
      
      if (roll[u]==6)//adds to designated element if specific value is matched
      {fourcheck [5]+=1;}
    }
     boolean fcheck=false;
   for (int fourchecks=0; fourchecks<6; fourchecks++)//checks if a value is rolled 4 times
   {
     if ((fourcheck[fourchecks])>=4)
     {fcheck=true;
     break;}
   }
    if (fcheck==true)
    {
    for (int i=0; i<5; i++)//for loop which runs for values in the array
     {
       {fourres+=roll[i];}//calculates sum of array's values
     }
    }
    
    return fourres;//returns result
  } 

  
  



 public int house (int rolls [])
  {
    int houseres=0;
    int[] hcheck = {0,0,0,0,0,0};
    for (int o=0; o<5; o++)//fills new array with amount of numbers of each dice roll value
    {
      if (roll[o]==1)//adds to designated element if specific value is matched
      {hcheck [0]+=1;}
      
      if (roll[o]==2)//adds to designated element if specific value is matched
      {hcheck [1]+=1;}
      
      if (roll[o]==3)//adds to designated element if specific value is matched
      {hcheck [2]+=1;}
      
      if (roll[o]==4)//adds to designated element if specific value is matched
      {hcheck [3]+=1;}
      
      if (roll[o]==5)//adds to designated element if specific value is matched
      {hcheck [4]+=1;}
      
      if (roll[o]==6)//adds to designated element if specific value is matched
      {hcheck [5]+=1;}
    }
    
    boolean hthcheck=false;
   for (int htchecks=0; htchecks<6; htchecks++)
   {
     if ((hcheck[htchecks])==3)//checks if a value is rolled 3 times
     {hthcheck=true;
     break;}
   }
    
   boolean hocheck=false;
   for (int hochecks=0; hochecks<6; hochecks++)
   {
     if ((hcheck[hochecks])==2)//checks if a value is rolled 2 times
     {hocheck=true;
     break;}
   }
   
    if (hthcheck==true && hocheck==true)
    {houseres=25;}//sets result to score if requirements are met
             
    return houseres;//returns result
  } 



public int smallstraight (int rolls [])
  {
    int smres=0;//variable declaration
    int smcheckfor=0;
    int[] smcheck = {0,0,0,0,0,0};
    for (int p=0; p<5; p++)//fills new array with amount of numbers of each dice roll value
    {
      if (roll[p]==1)//adds to designated element if specific value is matched
      {smcheck [0]+=1;}
      
      if (roll[p]==2)//adds to designated element if specific value is matched
      {smcheck [1]+=1;}
      
      if (roll[p]==3)//adds to designated element if specific value is matched
      {smcheck [2]+=1;}
      
      if (roll[p]==4)//adds to designated element if specific value is matched
      {smcheck [3]+=1;}
      
      if (roll[p]==5)//adds to designated element if specific value is matched
      {smcheck [4]+=1;}
      
      if (roll[p]==6)//adds to designated element if specific value is matched
      {smcheck [5]+=1;}
    }
   for (int f=0; f<6; f++)
   {
     if (smcheck[f]>0)//checks for consecutive numbers
     {smcheckfor++;}
     else 
     {smcheckfor=0;}//resets when numbers aren't consecutive anymore
     if (smcheckfor>=4)//checks for 4 consecutive numbers
     {break;}//ends loop
   }
   if (smcheckfor>=4)//if 4 numbers are consecutive
   {smres=30;}//resets score
   return smres;//returns result
  } 



 public int largestraight (int rolls [])//large straight method
  {
    int lscheckfor=0;//variable declaration
    int[] lscheck = {0,0,0,0,0,0};
    for (int a=0; a<5; a++)//fills new array with amount of numbers of each dice roll value
    {
      if (roll[a]==1)//adds to designated element if specific value is matched
      {lscheck [0]+=1;}
      
      if (roll[a]==2)//adds to designated element if specific value is matched
      {lscheck [1]+=1;}
      
      if (roll[a]==3)//adds to designated element if specific value is matched
      {lscheck [2]+=1;}
      
      if (roll[a]==4)//adds to designated element if specific value is matched
      {lscheck [3]+=1;}
      
      if (roll[a]==5)//adds to designated element if specific value is matched
      {lscheck [4]+=1;}
      
      if (roll[a]==6)//adds to designated element if specific value is matched
      {lscheck [5]+=1;}
    }
    for (int g=0; g<6; g++)
   {
     if (lscheck[g]>0)//checks for consecutive numbers
     {lscheckfor++;}
     else 
     {lscheckfor=0;}//resets when numbers aren't consecutive anymore
     if (lscheckfor>=5)//if 5 numbers are consecutive
     {break;}//ends loop
   }
   if (lscheckfor>=5)//checks if 5 numbers are consecutive
   {return 40;}//returns score
   else {return 0;}
  }
 
 
 
 
   public int yahtzee (int rolls [])//yahtzee method
  {
    if ((roll[0]==roll[1])&& (roll[1]==roll[2]) && (roll[2]==roll[3]) && (roll[3]==roll[4]) && (roll[4]==roll[0]) )//if all elements are the same
      {return 50;}//returns appropriate score
    else {return 0;}
  }
   
   
   
  
   
   public int chance (int rolls [])//method for chance
  {
    int csum=0;
    for(int t=0; t<5; t++)//for loop which runs for values in the array
    {
      csum+=roll[t];//calculates sum of array's elements
    }
    return csum;//returns sum
  }
   
   
  
  
  public int upper (int num, int rolls [])//method which calculates result of upper limit
  {
    int score=0;
     for (int w=0; w<5; w++)//for loop which runs for values in the array
     {
       if (num==roll[w])
       {score+=num;}//sum of selected numbers in array
     }
     return score;//returns value
  }
  
  
  
  
 
  
  }
  
  
  
