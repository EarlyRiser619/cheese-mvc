package org.launchcode.cheesemvc.models;

import java.util.HashMap;

public class Cheese {
        //properties
        private String description;

        private String name;

        private static HashMap<String, String> cheeses = new HashMap<>();

        public String getDescription() {
            return description;
        }

        public Cheese(){
        }

        public Cheese(String name, String description){
            this.name = name;
            this.description = description;
            this.cheeses.put(name, description);

        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static HashMap<String, String> getCheeses() {
            return cheeses;
        }
}

