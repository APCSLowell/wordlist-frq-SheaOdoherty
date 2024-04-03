import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
   int counter =0;
    for( int i = 0; i < WordList.size(); i ++){
      if(WordList.get(i).length() == len){
        counter++;
      }
    }
   return counter;
  }

  public void removeWordsOfLength(int len)
  {
    for( int i = 0; i < WordList.size(); i ++){
      if(WordList.get(i).length() == len){
        WordList.remove(i);
        i--;
      }
    }
  }
}
