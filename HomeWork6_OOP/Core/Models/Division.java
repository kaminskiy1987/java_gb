package HomeWork6_OOP.Core.Models;

/**
 * Класс Division имплементирует методы StructureUnit для получения и подстановки подразделения
 */
public class Division implements StructureUnit {
    private final String[] companyDivisions = new String[]{"Управляющая компания", "Продажи", "Закупки", "Склад"};
    private String division;

    Division() {
        division = companyDivisions[0];
    }

    @Override
    public void setUnit(String division) {
        if (division.isEmpty()) {
            this.division = companyDivisions[0];
        } else {
            this.division = "Несуществующее подразделение";
            for (int i = 0; i < companyDivisions.length; i++) {
                if (division.equals(companyDivisions[i])) {
                    this.division = division;
                    break;
                }
            }
        }
    }

    @Override
    public String getUnit() {
        return this.division;
    }
}