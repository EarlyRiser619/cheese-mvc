package org.launchcode.cheesemvc.models;

import java.util.HashMap;

public class Cheese {
        //properties
        private String description;
        private int cheeseId;
        private String name;
        private static int nextId = 1;


        public Cheese(String name, String description){
            this();
            this.name = name;
            this.description = description;
        }

        public Cheese(){
            cheeseId = nextId;
            nextId++;
        }

        public String getDescription() {
        return description;
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

        public int getCheeseId() {
            return cheeseId;
        }

        public void setCheeseId(int cheeseId) {
            this.cheeseId = cheeseId;
        }
}

