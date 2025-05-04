/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.*/
public String nTwice(String str, int n)
{
  String str1 = "";
  for(int i = 0; i < n; i++)
  {
    str1 = str.substring(0,n) + str.substring(str.length()-n);
  }
  return str1;
}
