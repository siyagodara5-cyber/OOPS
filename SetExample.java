// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
   public SetExample() {
   }

   public static void main(String[] var0) {
      HashSet var1 = new HashSet();
      var1.add("Apple");
      var1.add("Banana");
      var1.add("Mango");
      System.out.println("After Insertion: " + String.valueOf(var1));
      var1.remove("Banana");
      System.out.println("After Deletion: " + String.valueOf(var1));
      var1.remove("Apple");
      var1.add("Grapes");
      System.out.println("After Update: " + String.valueOf(var1));
      if (var1.contains("Mango")) {
         System.out.println("Mango is found in the set");
      } else {
         System.out.println("Mango is not found");
      }

      System.out.println("Traversal using for-each:");

      for(String var3 : var1) {
         System.out.println(var3);
      }

      System.out.println("Traversal using Iterator:");
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         System.out.println((String)var4.next());
      }

   }
}
