package HomeWork6_OOP.Core.Models;

/**
 * Класс Position имплементирует методы StructureUnit для получения и подстановки должности
 */
public class Position implements StructureUnit {

    private final String[] companyPositions = new String[]{"Офисный разнорабочий", "Управляющий",
            "Старший сотрудник", "Сотрудник", "Младший сотрудник", "Стажер"};

    private String position;

    Position() {
        position = companyPositions[0];
    }

    @Override
    public void setUnit(String position) {
        if (position.isEmpty()) {
            this.position = companyPositions[0];
        } else {
            this.position = "Несуществующая должность";
            for (int i = 0; i < companyPositions.length; i++) {
                if (position.equals(companyPositions[i])) {
                    this.position = position;
                    break;
                }
            }
        }
    }

    @Override
    public String getUnit() {
        return this.position;
    }
}