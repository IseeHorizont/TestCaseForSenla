package Task2;

public class Task2 {

    // На вход приходят 2 вектора, описанные координатами точек его начала
    // (x1,y1) и конца (x2,y2). Найдите длины векторов, а также векторы
    // произведения первого вектора на второй и второго на первый (получим 2 новых вектора).
    // Векторы выводить в формате “начало (x1,y1), конец (x2,y2)”.

    public static void main(String[] args) {
        Vector firstVector = new Vector(1, Math.sqrt(3), -3, 1);
        Vector secondVector = new Vector(-1, 4, -5, 11);

        firstVector.length();
        secondVector.length();

        firstVector.multiplyWithVector(secondVector);
        secondVector.multiplyWithVector(firstVector);
    }
}
