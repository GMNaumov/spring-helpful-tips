/**
 * Пример использования бина с чтением конфигурации из файла XML
 */
public class Solution {
    public static void main(String[] args) {
        // Создаём объект класса ClassPathXmlApplicationContext, получающего информацию о конфигурации из файла XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // Создаём новый экземпляр нашего бина
        // Первый аргумент метода getBean() - "customBean", - идентификатор бина из файла XML (id)
        // Второй аргумент метода getBean() - CustomBean.class, - тип создаваемого объекта
        CustomBean customBean = context.getBean("customBean", CustomBean.class);

        System.out.println(customBean.getName());

        // ОБЯЗАТЕЛЬНО закрываем контекст после завершения работы. Можно использовать try с ресурсами
        context.close();
    }
}
