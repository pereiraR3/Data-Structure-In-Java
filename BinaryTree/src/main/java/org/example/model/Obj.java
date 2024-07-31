package org.example.model;

import java.util.Objects;

public class Obj extends ObjTree<Obj> {

    Integer myValue;

    public Obj(Integer myValue){
        this.myValue = myValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(myValue, obj.myValue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(myValue);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.myValue > outro.myValue){
            i = 1;
        }else if(this.myValue < outro.myValue){
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return myValue.toString();
    }


}
