package PracticingPracticals;
import java.util.*;

/**
 * Write a description of class EachWordFrequency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EachWordFrequency
{
    WordFrequency arr[];
    int numOfWords, numOfWordsInarr;
    String sent;
    static Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.print("\nEnter sentence: ");
        sent = sc.nextLine().toUpperCase();
    }
    
    public boolean validationCheck(){
        numOfWords = sent.split("\\s").length;
        return !(numOfWords < 2 || numOfWords > 9);
    }
    
    public void storeFrequency(){
        arr = new WordFrequency[numOfWords];
        String words[] = sent.split("\\s");
        int i, j;
        numOfWordsInarr = 0;
        for(i = 0; i < words.length; i++){
            for(j = 0; j < numOfWordsInarr; j++){
                if(words[i].equals( arr[j].word)){
                    arr[j].freq++;
                    break;
                }
            }
            if(j == numOfWordsInarr){
                arr[numOfWordsInarr].word = words[i];
                arr[numOfWordsInarr].freq = 1;
            }
        }
    }
    
    public void arrangeFrequencyInOrder(){
        int i, j;
        WordFrequency t;
        for(i = 0; i < numOfWordsInarr - 1; i++){
            for(j = 0; j < numOfWordsInarr - 1 - i; j++){
                if(arr[j].freq > arr[j+1].freq){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    
    public void display(){
        int i;
        System.out.print("\nWord\t\tFrequency");
        for(i = 0; i < numOfWordsInarr; i++){
            System.out.print("\n"+arr[i].word+"\t\t"+arr[i].freq);
        }
    }
    
    public static void main(String[] args){
        EachWordFrequency ewf = new EachWordFrequency();
        ewf.input();
        if(!ewf.validationCheck()){
            System.out.print("\nTotal number of words: " + ewf.numOfWords);
            System.out.print("\nInvalid Input");
        }
        else{
            ewf.storeFrequency();
            ewf.arrangeFrequencyInOrder();
            ewf.display();
        }
    }
    
}
class WordFrequency{
    String word;
    int freq;

}