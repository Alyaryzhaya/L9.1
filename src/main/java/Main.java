public class Main {

    public static void main(String[] args) {

            Poster poster = new Poster(); // переменная типа Постер и новый объект, пока ничего не умеет


        // учим его запоминать информацию о себе (заводим Поля в классе Постер)
        // теперь внутри КАЖДОГО объекта Poster есть три ячейки, которые мы создали в классе Poster

        // Обращаться к полям у этого объекта:
        poster.title = "Matrix";
        poster.releaseYear = 1999;
        poster.imageUrl = "???";

        // Если хотим вывести на печать: (как у массивов, только не через номер ячейки [], а через точку

        System.out.println(poster.releaseYear);

    }
}
