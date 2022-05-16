package task.task13.task1302;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("телефона одинаковые");
        }
    }
}

    class CellPhone{
        String model;
        String vendor;

        public CellPhone(String model, String vendor){
            this.model = model;
            this.vendor = vendor;
        }

        @Override
        public boolean equals(Object o){
            if(o == this) return true;
            if(o == null || getClass() != o.getClass())
                return false;
            CellPhone cellPhone = (CellPhone) o;
            return Objects.equals(vendor, cellPhone.vendor) &&
                    Objects.equals(model, cellPhone.model);
        }

        @Override
        public int hashCode(){
            return Objects.hash(model, vendor);
        }
    }
