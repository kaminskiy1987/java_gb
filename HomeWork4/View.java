package HomeWork4;

public class View {

    public View() {
    }

    public String getRawData(int[][] table) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : table) {
            for (int column : row) {
                sb.append(String.format("%5d", column));
            }

            sb.append("\n");
        }

        return sb.toString();
    }

    public String getVisualData(int[][] table) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : table) {
            for (int column : row) {
                switch (column) {
                    case -1:
                        sb.append("#");
                        break;
                    case 1:
                        sb.append("S");
                        break;
                    case -2:
                        sb.append("F");
                        break;
                    case 88:
                        sb.append(".");
                        break;
                    default:
                        sb.append(" ");
                        break;
                }

                sb.append(String.format("%1s", " "));
            } 

            sb.append("\n");
        }

        return sb.toString();
    }
}