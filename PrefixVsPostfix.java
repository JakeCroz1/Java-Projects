public class PrefixVsPostfix{
   public static void main(String[] args){
   
      //Prefix increment: ++i
      //Postfix increment: i++
      //Prefix decrement: --i
      //Postfix decrement: i--
      //i++ and ++i both can be broken down as i = i + 1
      //i-- and --i both can be broken down as i = i - 1
      //During prefix the initialized variable is icremented in ++i.
      //Finally, the initialized variable is assigned to its associated variable.
      //During profix the initialized variable is assigned to its associated variable.
      //Finally, the initialized variable is icremented in i++.
      //fix increment. This expression can broken down as j = i; and i= i + 1;
      int i = 1;
      int j = ++i; //i++ is called prefix increment. This expression can broken down as j = i = i + 1;
      System.out.println("Prefix: " + "(i) is first assign to (j), thus " + "(j)="+j);
      System.out.println("Finally, (i) is incremented by 1, thus " + "(i)="+i);
      System.out.println("*********************************************************");
      
      int i2 = 1;
      int j2= i2++; //++i is called postfix increment. This expression can broken down as j = i = i + 1;
      System.out.println("Postfix: " + "(i2) is first incremented by 1, thus " + "(i2)="+i2);
      System.out.println("Finally, (i2) is assigned to (j), thus " + "(j2)="+j2);

      System.out.println("*********************************************************");
      System.out.println("*********************************************************");
      //like wise, i-- and --i both can be broken down as i = i - 1
      int i3 = 1;
      int j3 = --i3; //i-- is called prefix decrement. This expression can broken down as j = i = i - 1;
      System.out.println("Prefix: " + "(i) is first assign to (j), thus " + "(j)="+j);
      System.out.println("Finally, (i) is decremented by 1, thus " + "(i)="+i);
      System.out.println("*********************************************************");
      int i4 = 1;
      int j4= i4--; //--i is called postfix decrement. This expression can broken down as j = i = i - 1;
      System.out.println("Postfix: " + "(i4) is first decremented by 1, thus " + "(i4)="+i4);
      System.out.println("Finally, (i4) is assigned to (j4), thus " + "(j4)="+j4);
      System.out.println("=============================================================");
      System.out.println("In summary, you get two answers for both i and j. ");
   
   }//end of main

}//end of class