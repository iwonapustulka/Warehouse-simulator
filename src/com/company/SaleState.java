package com.company;

public enum SaleState{
    ORDERED{
        @Override
        public String toString(){
            return "ordered";
        }
    },
    INAWAREHOUSE{
        @Override
        public String toString(){
            return "in a warehouse";
        }
    },
    SOLD{
        @Override
        public String toString(){
            return "sold";
        }
    }
}
