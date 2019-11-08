package com.company;

import java.util.Objects;
    public class Item implements Comparable<Item>{
        private String description;
        private int partNumber;

        public Item(String description, int partNumber) {
            this.description = description;
            this.partNumber = partNumber;
        }
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(int partNumber) {
            this.partNumber = partNumber;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "description='" + description + '\'' +
                    ", partNumber=" + partNumber +
                    '}';
        }

        /**
         * 重写equals方法
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Item other = (Item) obj;
            return Objects.equals(description, other.description) && partNumber == other.partNumber;

        }
        /**
         *重写hashCode方法
         */
        @Override
        public int hashCode() {
            return Objects.hash(description,partNumber);
        }

        /**
         * 重写compareTo方法
         */
        @Override
        public int compareTo(Item other){
            int diff=Integer.compare(partNumber,other.partNumber);
            return diff!=0?diff:description.compareTo(other.description);
        }
    }



