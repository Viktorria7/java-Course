package com.javacourse.lesson6;

import java.nio.FloatBuffer;
import java.util.HashMap;

   public class Notebook {
      private String note;
      private Map<Int, String> dictionary;

      public class Dictionary {
         private HashMap<String, String> map;

         public Dictionary() {
            map = new HashMap<>();
            map.put("Belarus", "Country");
            map.put("Children", "Parents");
            map.put("Daughter", "Child");
            map.put("Cat", "Animal");
            map.put("Car", "Convenience");
         }

         public String getDictionary(String word) {
            return map.get(word);
         }
      }
   }